interface Animal{
    void eat();
    void sleep();   //interfaces is just like a class but it can only conatins the abstract methods without the body it can not contain any instance variable and constructor
}

class Dog implements Animal{
    public void eat(){
        System.out.println("Dog is eating");
    }
    public void sleep(){
        System.out.println("Dog is eating");
    }
}

class Cat implements Animal{
    public void eat(){
        System.out.println("Cat is eating");

    }
    public void sleep(){
        System.out.println("Cat is sleaping");
    }
}



public class Interfaces {

    public static void main(){
        Dog ob1=new Dog();
        Cat ob2=new Cat();
        ob1.eat();
        ob1.sleep();
        ob2.eat();
        ob2.sleep();



    }
    
}
