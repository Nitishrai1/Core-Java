import java.util.*;
public class code4 {

    public <E> void printArray(E []s){
        for (E item: s) {
            System.out.println(item);
            
        }
    }


    public static void main(String args[]){
        code4 e1=new code4();
        String country[]=new String[]{"indea","nepal","bhutan"};
        int[] intArray = {1, 2, 3, 4, 5};
        e1.printArray(country);
        e1.printArray(intArray);

    }
    
}
