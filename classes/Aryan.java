// Parent class
class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    String breed;

    public Dog(String name, int age, String breed) {
        super(name, age); // Calling constructor of parent class
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }
}

// Child class inheriting from Animal
class Cat extends Animal {
    boolean isFriendly;

    public Cat(String name, int age, boolean isFriendly) {
        super(name, age); // Calling constructor of parent class
        this.isFriendly = isFriendly;
    }

    public void purr() {
        System.out.println(name + " is purring.");
    }
}

public class Aryan {
    public static void main(String[] args) {
        // Creating instances of Dog and Cat
        Dog dog = new Dog("Buddy", 3, "Labrador");
        Cat cat = new Cat("Whiskers", 2, true);

        // Calling methods from parent class
        dog.eat();
        dog.sleep();

        // Calling methods from child class
        dog.bark();

        // Calling methods from parent class
        cat.eat();
        cat.sleep();

        // Calling methods from child class
        cat.purr();
    }
}
