public class code5 {
    public static void main(String[] args){
        // rotate the matrix by 90 degree
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int n=arr.length;

        // Array before ratation
        for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            
            System.out.print(arr[i][j]+" ");
            
        }
        System.out.println();
    }
        for(int i =0;i<n;i++){
        for(int j=i+1;j<n;j++){
        int temp=arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
        }
        }
        for(int i=0;i<n;i++){
        int s=0,e=n - 1;
        while(s<e){
        int temp=arr[i][s];
        arr[i][s]=arr[i][e];
        arr[i][e]=temp;
        s++;
        e--;
        }
        }
        // array after rotation
        for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            
            System.out.print(arr[i][j]+" ");
            
        }
        System.out.println();
    }
    }

}