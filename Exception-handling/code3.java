// Try with Resourse 

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class code3 {
    public static void main(String args[]){
        BufferedReader br;=null;
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){   //taking the input in the try block parameter this help not to create a catch and finally block
            String str="";
            //  br=new BufferedReader(new InputStreamReader(System.in));
            str=br.readLine();
        }
        // catch(Exception e){
        //     System.out.println("Exception: "+e);
        // }
        // finally{
        //     br.close();
        // }


        
    }
}
