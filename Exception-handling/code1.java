// package Exception-handling;

// Exception are of three types
// Throwable class it contains exception and error
// exception contains 
// 1.checked contains IOException and SQLException
// 2.unchecked contains RuntimeException
// RuntimeException contains ArithmeticException,

// another is error 
import java.util.Scanner;

public class code1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // int i,j,k;
        // i=2;
        // j=0;
        // try{
        //     k=i/j;
        //     System.out.println(k);
        // }catch(ArithmeticException e){
        //     System.out.println("Cannot Divide by zero "+e);

        // }
        int arr[]=new int[4];
        try{
            int m=sc.nextInt();
            for(int i=0;i<=4;i++){
                arr[i]=sc.nextInt();

            }
            for(int i=0;i<m;i++){
                System.out.println(arr[i]);
            }
        }catch(Exception e){
            System.out.println(e);

        }
        
        

    }
    
}
