import java.util.*;
public class preorityQueue {
    public static void main(String args[]){
        Queue<Integer> p1=new PriorityQueue<>();
        p1.offer(1);
        p1.offer(3241);
        p1.offer(13);
        p1.offer(331);
        p1.offer(1324);
        System.out.println(p1);  //it is a min heap so the smallest number is in the first of the list
        p1.poll();
        System.out.println(p1);  //this will re arrange the queue according to the min heap
        System.out.println(p1.peek());  //this will print the peek element of the queue

        // Converting the min heap into the max heap
        Queue<Integer> p2=new PriorityQueue<>(Comparator.reverseOrder());
        p2.offer(1);
        p2.offer(3241);
        p2.offer(13);
        p2.offer(331);
        p2.offer(1324);
        System.out.println(p2);  //it is a min heap so the smallest number is in the first of the list
        p2.poll();
        System.out.println(p2);  //this will re arrange the queue according to the min heap
        System.out.println(p2.peek());  //this will print the peek element of the queue


    } 
    
}
