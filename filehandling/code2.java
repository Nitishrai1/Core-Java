import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class code2 {
    public static void main(String args[]){
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){//byte to char stream and then reading char stream
            
                System.out.println("You typed: "+br.readLine());
                
            


        } catch(IOException e){
            System.out.println(e.getMessage());
        }


        try(BufferedReader br=new BufferedReader(new FileReader("input.txt"))){//byte to char stream and then reading char stream
            String line;
           while ((line=br.readLine())!=null) {
            System.out.println(line);
           }
            
        


    } catch(IOException e){
        System.out.println(e.getMessage());
    }
    }
    
}
