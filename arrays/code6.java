package arrays;
import java.util.Scanner;

public class code6 {
    // Move all zeros to the end of the array
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        // int num=5;
        int arr[]=new int[num];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        int j=1;
        while(i<num && j<num){
            if(arr[i]!=0){
                i++;
            }
            else if(j<i ||arr[j]==0){
                j++;
            }
            else{
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            
        }
        for(int k=0;k<num;k++){
            System.out.print(arr[k]+" ");

        }
    }
    
}
