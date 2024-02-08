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

        int temp2[]=new int[d];
        for(int i=0;i<d;i++){
            temp2[i]=temp[n-d+i];
        }

        // shiftint the array element
        for(int i=n-1;i>=d;i--){
            temp[i]=temp[i-d];
        }
        for(int i=0;i<d;i++){
            temp[i]=temp2[i];
        }

        for(int i=0;i<temp2.length;i++){
            System.out.println(temp2[i]);
        }
    }
    
}
