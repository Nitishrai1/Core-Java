
// throws Exception keyword it is used to supresed the error
import java.util.Scanner;
public class code4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i=4;
        int d;
        try{
            d=sc.nextInt();
            if(d==0 ){
                throw new ArithmeticException("Dive by zero not possible");
            }
            int result=i/d;
            System.out.println("Result: "+result);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
    
}
