package arrays;

import java.util.Scanner;

public class code1 {
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // Declaring a array in java
        int arr[]={1,2,3,4};
        int n=arr.length;
        // System.out.print(n);   //this will give the size of the array
        // to declare the array of size n we have to write like
        int arr2[] =new int[5]; 
        // takiing the input from the console
        for(int i=0;i<5;i++){
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.println(arr2[i]);
        }
    }
    
}
