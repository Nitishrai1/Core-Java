

public class code4 {
    public static void main(String[]args){
        int arr[][]={{1,2,3},{5,6,7},{9,10,11}};
    int n=arr.length;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(i==j){
                continue;
            }
            else{
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }

        }
        
    }

    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            
            System.out.print(arr[i][j]+" ");
            
        }
        System.out.println();
    }

    }
    
    
}
