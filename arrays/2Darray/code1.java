
// Print the anti-Diagonal element of a 2D array
import java.util.Scanner;
public class code1 {
    public static void main(String[] args){
        int arr[][]={{1,2,3},{2,3,4},{5,6,7}};
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j==n-1){
                    System.out.println(arr[i][j]+" ");
                }
            }
        }

        // For main diagonal element
        System.err.println();
        System.out.println("The main diagonal element is");
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    System.out.println(arr[i][i]+" ");
                }
            }
        }

        

        
    }
    
}
