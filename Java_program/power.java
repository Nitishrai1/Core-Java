import java.util.Scanner;
public class power {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=1;
        while(i<=num){     
            double power=Math.pow(2,i);
            if(power<num){
                System.out.println(power);
                
            }
            else{
                break;
            }
            i++;
        }
        // Syntex to take input without number of input
        // while(sc.hasNextInt()){
        //     int num2=sc.nextInt();
        //     System.out.println(num2);

        // }
        sc.close();
    }
    
}
