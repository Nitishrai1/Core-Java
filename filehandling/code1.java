import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.util.*;  

public class code1 {
    public static void main(String args[]){
        // try(InputStreamReader isr=new InputStreamReader(System.in)){
        //     System.out.println("Enter some letters: ");
        //     int letters=isr.read();
        //     while(isr.ready()){
        //         System.out.println((char)letters);
        //         letters=isr.read();
        //     }
        //     // isr.close();
        //     System.out.println();
        // }catch(IOException e){
        //     System.out.println(e.getMessage());  
        // }


        try(FileReader fr=new FileReader("input.txt")){
            int letter=fr.read();
            while(fr.ready()){
                System.out.println((char)letter);
                letter=fr.read();
            }
            System.out.println();
           
        }catch(IOException e){
            System.out.println(e.getMessage());  
        }
    }
    
}
