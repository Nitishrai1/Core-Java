// IOException
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class code2 {
    public static void main(String args[]){
        int i,j,k;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            i=4;
            j=Integer.parseInt(br.readLine());
            System.out.println(i/j);


        }catch(NumberFormatException e){
            System.out.println("there is input error"+e);
        }catch(IOException e){
            System.out.println("error: "+e);
        }catch(Exception e){
            System.out.println("Exception "+e);
        }
        finally{
            br.close(); //closing all the resourese in the finall block
            System.out.println("Bye"); //this block is just like the defualt block it will run every time
        }

    }
    
}
