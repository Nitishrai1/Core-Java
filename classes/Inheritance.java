class Shape{
    String color;

    public void area(){
        System.out.println("displays area");
    }
}


class Triangle extends Shape{
    public void area(int l,int h){
        Sytem.out.println(1/2*l*h);
    }



}

public class Inheritance{
    public static void main(String args[]){
        Triangle t1=new Triangle();
        t1.color="red";

    }
}