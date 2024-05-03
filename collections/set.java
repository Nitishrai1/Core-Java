import java.util.*;
public class set{
    public static void main(String args[]){
        // in set thier can not be any duplicate element and the order is not defined in the set 
        Set<Integer> s1=new HashSet<>();
        s1.add(1);
        s1.add(34);
        s1.add(324);
        s1.add(32);
        

        System.out.println(s1);
        s1.remove(34);
        if(s1.contains(324)){
            System.out.println(324+" is present in the set");
        }
        else{
            System.out.println(324+" is not present in the set");
        }
        if(s1.isEmpty()){
            System.out.println("Empty");
        }else{
            System.out.println("Not empty");
        }
        s1.clear();  //this is used to clear the element of the set
        if(s1.isEmpty()){
            System.out.println("Empty");
        }else{
            System.out.println("Not empty");
        }

        Set<Integer> s2=new LinkedHashSet<>(); //this will create a set which follow the property of the linkedlist also and the element will be stored one by one
        s2.add(1);
        s2.add(34);
        s2.add(324);
        s2.add(32);
        

        System.out.println(s2);

        Set<Integer> s3=new TreeSet<>(); //this will create a set which follow the property of the Binarysearchtree also and the element will be sorted form one by one
        s3.add(1);
        s3.add(34);
        s3.add(324);
        s3.add(32);
        

        System.out.println(s3);

    }
}