package arrays;

import java.util.Scanner;

public class code3 {
    // Wap to create a array and reverse it
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // reversing the array
        // for(int i=n-1;i>=0;i--){
        //     System.out.print(arr[i]+" ");
        // }
        int st=0;
        int last=n-1;
        while (st<last) {
            int ele=arr[st];
            arr[st]=arr[last];
            arr[last]=ele;

            st++;
            last--;
            
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}
