// import java.util.Queue;
import java.util.*;
public class Myqueue {

    public static void main(String args[]){
        Queue<Integer> q1=new LinkedList<>();
        q1.offer((12));
        q1.offer((34));  //it return true or flase when the element is not inserted we can use add also but it throws a exception
        q1.offer((42));
        q1.offer((35));   //offer() it is used to insert the element inside a queue
        System.out.println(q1);

        System.out.println(q1.poll());  //poll() is used to pop a element from the queue

        System.out.println(q1.peek());   //peeek() it is used to get the first element from the queue


    }
}
