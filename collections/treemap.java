import java.util.*;
public class treemap {
    public static void main(String args[]){
        Map<Integer,String> m1=new TreeMap<>();  //this will create a map using the bst ans store the element in sorted form based on key
        m1.put(1,"one");
        m1.put(7,"two");
        m1.put(3,"three");
        m1.put(4,"four");
        System.out.println(m1);
        m1.remove(7);
        System.out.println(m1);

    }
    
}
