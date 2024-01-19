import java.util.Scanner;
public class unery_operator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num=5;
        // System.out.println(++num);   //Before printing increases by 1
        // System.out.println(num++);  //After printing incream by 1
        System.out.println(num++ + ++num + num++);
        // ! not operator
        int a=5;
        int b=6;
        if(!(a<b)){
            System.out.println(a + " is greater then "+ b);
        }
        else{
            System.out.println(b + " is greater then "+ a);

        }
        sc.close();
    }
    
}
