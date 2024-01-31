// Pattern4
//     1
//    21
//   321
//  4321
public class pattern4{
    public static void main(String[]args){
        int num=4;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
            
                System.out.print(" ");
            
            }
            for(int k=i;k>=1;k--){
                System.out.print(k);
            }
            System.out.println();
         }


    }
}