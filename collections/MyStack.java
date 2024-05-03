import java.util.Stack;
public class MyStack {
    public static void main(String args[]){
        Stack<String> stk=new Stack<>();
        stk.push("lion");
        stk.push("dog");
        stk.push("elephant");
        stk.push("goat");
        System.out.println(stk);
        System.out.println("Peek element is: "+stk.peek());
        System.out.println("Popping element is: "+stk.pop());
        


    }
    
}
