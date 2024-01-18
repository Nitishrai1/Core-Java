package conditionstatements;

import java.util.Scanner;

public class maximumnumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int num;
        // num=a>b?a:b;
        num=Math.max(a,b);
        System.out.println("The value which is maximum is: "+num);
        sc.close();
    }
    
}
