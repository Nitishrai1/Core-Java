
// File object in java
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
public class code4 {
    public static void main(String args[]){
        // try{
        //     File fo=new File("new-file.txt");
        //     fo.createNewFile();
        
        // }catch(IOException e){
        //     System.out.println(e.getMessage());
        // }

        // try{
        //     FileWriter fw=new FileWriter("new-file.txt");
        //     fw.write("Hello world");
        
        // }catch(IOException e){
        //     System.out.println(e.getMessage());
        // }
        
        try(BufferedReader fr=new BufferedReader(new FileReader("new-file.txt"))){
            String line;
            while((line=fr.readLine())!=null){
                System.out.println(line);
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
    

