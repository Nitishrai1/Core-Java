// wap to throw a user defined exception
public class code5 {
    public static void main(String args[]){
        int i=5;
        try{
            int d=2;
            if(d<5){
                throw new MyException("Less then 5");
            }
        }catch(MyException e){
            System.out.println(e);
        }
    }
    
}
class MyException extends Exception{
    public MyException(String msg){
        super(msg);
    }
}
