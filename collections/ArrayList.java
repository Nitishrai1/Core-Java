// package collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
class MyArrayList {
    public static void main(String args[]){
        ArrayList<String> arr=new ArrayList<>();
        arr.add("Nitish");
        arr.add("Mihir");
        arr.add("Manish");
        arr.add("Rohan");  //adding the element in the arraylist

        List<String> list=new ArrayList();
        list.add("hello");
        list.add("my");
        list.add("name is");
        list.add("Nitish");   //this will add the string to the last of the list
        System.out.println(list);

        list.add(1,"Ishan");  //this will add Ishan to the first index of the list and shift the remaining element to the right side

        List<String> list2=new ArrayList();
        list.add("ram");
        list.add("shita");
        list.addAll(list2);   //we can append new list inside a list

        System.out.println(list.get(2)); //getting the element from the list
        System.out.println(list);

        list.remove(2);  //this will remove the element at the index 2
        list.remove("ram"); //this will remove ram from the list
        // list.clear(); //this is used to clear all the element of the list
        list.set(2,"Nidhi"); //this is used to set the value of the 2 index to the new value
        list.contains("Nidhi"); //this will return true or false if the element is present in the list 

        // Iterator in the collection framwork
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        // using for iterator
        for(String item:list){ 
            System.out.println(item);
        }
        // By using iterator
        Iterator<String> it=list.iterator();
        while (it.hasNext()) {   //hasnext() check if the element is present in the next than it execute
            System.out.println("Iterator el "+it.next());   
            
        }

    }
    
}
