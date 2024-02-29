class Pen{
    String color;
    String type;

    Pen(String c,String t){
        this.color=c;
        this.type=t;
    }


    public void write(){
        System.out.println("Writing something");
    }

}

public class Oops {

    public static void main(String[] args){
        Pen pen1=new Pen("red","ballpen");
        pen1.write();

    }
    
}
