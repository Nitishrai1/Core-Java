class Shape{
    String color;

    public void area(){
        System.out.println("displays area");
    }
}


class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }



}

// class Circle extends Shape{
//     public void area(int r){
//         System.out.println((3.14)*r*r);     //this is called herarical inheritance
//     }
// }

class EqualiteralTriangle extends Triangle{    //multilevel inheritance
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}


// Multiple inheritance in not possible in java by default but it can be achived with the help of interfaces

public class Inheritance{
    public static void main(String args[]){
        Triangle t1=new Triangle();
        t1.color="red";

    }
}