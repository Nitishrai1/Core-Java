package arrays;

import java.util.Scanner;

public class code9 {

    // Rotated the array towards the right prosition
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp[]=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=sc.nextInt();

        }
        System.out.println("Enter the no of element");
        int d=sc.nextInt();
        int t=d;
        int temp2[]=new int[d];
        for(int i=d;i<n;i++){
            temp2[i]=temp[i];
            
            
        }
        // shifting the array to right
        for(int i=0;i<n-d;i--){
            temp[n-d+i]=temp[i]
        }
    }
    
}
