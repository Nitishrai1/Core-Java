import java.util.Scanner;
public class loops {
    // Print the table of 2
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=2;
        int i = 1;
        while(i<10){
            System.out.println(num +" * "+ i +" = "+num*i);
            i++;
        }
        sc.close();
}

    
}
