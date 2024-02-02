package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class code5 {
    // Sort the given array so that the number are arange into accesind to decending
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        // Arrays.sort(arr); second approch
        int k=0;
        int j=1;
        while (j<num && k<num) {   //This will convert the array to positive one side and negative one side
            if(arr[k]<0){
                k++;
            }
            else if(j<=k || arr[j]>=0){
                j++;
                

            }
            else{
                int temp=arr[k];
                arr[k]=arr[j];
                arr[j]=temp;
            }
            
        }
        for(int i=0;i<num;i++){
            System.out.print(arr[i]+" ");

        }

    }
    
}
