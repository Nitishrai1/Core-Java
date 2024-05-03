import java.util.*;
public class DoublyEndendqueue {
    public static void main(String args[]){
        ArrayDeque<Integer> adq=new ArrayDeque<>();
        adq.offer(1);  //this property come from the list property an add the elemnet to the last of the queue
        adq.offerFirst(72); //this will add the element to the head of the dqueue
        adq.offerLast(11);   //this will add the element to the tail of teh dqueue
        System.out.println(adq);
        System.out.println(adq.peek()); //this will print the first
        System.out.println(adq.poll());  //thiswill remove the first

        System.out.println(adq.peekFirst()); //this will print the first
        System.out.println(adq.peekLast());//this will print the last
        System.out.println(adq.pollFirst());//this will removee the first
        System.out.println(adq.pollLast());//this will remove the last


    }
    
}
