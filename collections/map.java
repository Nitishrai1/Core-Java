import java.util.*;
public class map {
    public static void main(String args[]){
        // Map is used to store the key value pair the key should be unique if same key entered then the value is overriden 
        Map<Integer,String> m1=new HashMap<>();
        m1.put(1,"one");
        m1.put(2,"two");
        m1.put(3,"three");
        m1.put(4,"four");
        System.out.println(m1);
        if(!m1.containsKey(8)){
            m1.put(8, "Nitish");
        }
        // or we can use putIfAbsent
        m1.putIfAbsent(5,"Rohan");
        System.out.println(m1);
        // How to iterator in the map
        for(Map.Entry<Integer,String> e:m1.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

        for(Integer key:m1.keySet()){
            System.out.println(key);
        }

        for(String val:m1.values()){
            System.out.println(val);
        }

        m1.containsValue("Rohan");
        m1.isEmpty();

    }
    
}
