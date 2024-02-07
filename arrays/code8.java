package arrays;

import java.util.Scanner;

public class code8 {
    // Program for array left rotation by d positions.

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp[]=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=sc.nextInt();

        }
        System.out.println("Enter the no of element");
        int d=sc.nextInt();

        // storing the element in another temp variable
        int temp2[]=new int[d];
        for(int i=0;i<d;i++){
            temp2[i]=temp[i];
        }

        // Shifting the temp array element
        for(int i=d;i<n;i++){
            temp[i-d]=temp[i];
            
        }
        // inserting the element at last
        for(int i=0;i<d;i++){
            temp[n-d+i]=temp2[i];
        }


        System.out.println("The array is: ");
        for(int i=0;i<n;i++){
            System.out.println(temp[i]);
        }

    }
    
}
