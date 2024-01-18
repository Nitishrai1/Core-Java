package conditionstatements;

import java.util.Scanner;

public class first {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double number1=sc.nextInt();
        System.out.println("Enter the second number: ");
        double number2 = sc.nextInt();
        if(number1<number2){
            System.out.println(number1 + "is greater then "+ number2);
        }
        else if(number1>number2){
            System.out.println(number2 + "is greater then "+ number1);
        }
        sc.close();

    }
    
}
