// outputSteamWriter
// import java.outputSteamWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class code3 {
    public static void main(String args[]) {
        // try (OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
        //     osw.write("Hello world\n");
        //     osw.write(Integer.toString(35)); // Writing '35' as a string
        //     osw.write("\n");
        //     osw.write(Integer.toString(235)); // Writing '235' as a string
        //     osw.write("\n");
        //     char arr[] = "Hello works".toCharArray();
        //     osw.write(arr);

        // } catch (IOException e) {
        //     System.out.println(e.getMessage());
        // }

        // FileReader
        // try(FileWriter fw=new FileWriter("input.txt",true)){  //true is written to append in the existing file by defualt the mode in write mode 
        //     fw.write("Hello world");
        // }catch(IOException e){
        //     System.out.println(e.getMessage());
        // }

        try(BufferedWriter bw=new BufferedWriter(new FileWriter("input.txt"))){
            bw.write("Hare krishna");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }


    }
}
