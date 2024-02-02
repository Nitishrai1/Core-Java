package arrays;

import java.util.Scanner;

public class code7 {

    // WAP to sort the array and put all the 0s and 1s and 2s
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int one=0,zero=0,two=0;
        for(int i=0;i<num;i++){
            if(arr[i]==0){
                zero++;
            }
            else if(arr[i]==1){
                one++;
            }
            else{
                two++;
            }
        }
        int k=0;
        while(zero>0){
            arr[k++]=zero;
            zero--;
        }
        while(one>0){
            arr[k++]=one;
            one--;
        }
        while(two>0){
            arr[k++]=two;
            two--;
        }
        for(int i=0;i<num;i++){
            System.out.print(arr[i]+" ");

        }
    
    }

    
}
