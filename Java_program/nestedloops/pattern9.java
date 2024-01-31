import java.util.Scanner;
public class pattern8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if((i+j)%2==0){
                    System.out.print("w");
                }
                
                else{
                    System.out.print("B");
                }

            }
            System.out.println();

        }
    }
}