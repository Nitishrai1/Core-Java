package conditionstatements;

import java.util.Scanner;

public class primenumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int flag=0;
        if(number==1){
            System.out.println("Not a prime number");
        }
        else{
            for(int i=2;i<number/2;i++){
                if(number%1==0){
                    flag++;
                }
            }
        }
        if(flag>0){
            System.out.println("Not a prime number");
        }
        else{
            System.out.println("Is a prime number");
        }
        sc.close();

    }
    
}
