package arrays;

import java.util.Scanner;

public class code4 {
    // Given a array rwturn the times of occurence of the given number in the array
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]={1,2,3,4,5,4,5,4,5,6,7,8};
        int res=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                res++;
            }
        }
        System.out.println("The occurence of the number "+num+" is "+res);

    }
    
}
