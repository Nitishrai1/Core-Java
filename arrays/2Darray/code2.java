

public class code2 {
    public static void main(String[]args){
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        
        for(int i=0;i<arr.length;i++){
            int start=0;
            int j=arr[0].length-1;
            while(i<=j){
                int temp=arr[i][start];
                arr[i][start]=arr[i][j];
                arr[i][j]=temp;
                start++;
                j--;
                
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                
                System.out.print(arr[i][j]+" ");
                
            }
            System.out.println();
        }
    }
    
}
