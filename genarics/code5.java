import java.util.ArrayList;
import java.util.Collections;

public class code5 {
    public static void main(String args[]) {
        ArrayList<Integer> mylist = new ArrayList<>();
        mylist.add(1);
        mylist.add(5);
        mylist.add(6);
        mylist.add(2);
        mylist.add(1);
        mylist.add(13);
        mylist.add(132);

        System.out.println("Printing");
        for (Integer item : mylist) {
            System.out.println(item);
        }

        int firstElement = mylist.get(0);
        System.out.println("First element: " + firstElement);

        // Removing the element at index 4 (fifth element)
        mylist.remove(4);
        System.out.println("Printing after removing element at index 4");
        for (Integer item : mylist) {
            System.out.println(item);
        }

        // Sorting the ArrayList
        Collections.sort(mylist);
        System.out.println("Printing after sorting");
        for (Integer item : mylist) {
            System.out.println(item);
        }

        // Reversing the order of elements in the ArrayList
        Collections.reverse(mylist);
        System.out.println("Printing after reversing");
        for (Integer item : mylist) {
            System.out.println(item);
        }
    }
}
