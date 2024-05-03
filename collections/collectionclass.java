// collection class has many property used to perform differened task
import java.util.Collections;
import java.util.Comparator;
import java.util.*;
public class collectionclass {
    public static void main(String args[]){
        List<Integer> list=new ArrayList<>();
        list.add(34);
        list.add(4);
        list.add(34);
        list.add(32);
        System.out.println("Min element: "+Collections.min(list));
        System.out.println("Max element: "+Collections.max(list));
        System.out.println("Frequesncy of "+34+" is: "+Collections.frequency(list,34));
        Collections.sort(list);
        System.out.println(list);
        
        Collections.sort(list,Comparator.reverseOrder());
        System.out.println(list);




        


    }
    
}
