class Shape {
    public double calArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // @Override
    public double calArea() {
        return length * breadth;
    }
}

class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    // @Override
    public double calArea() {
        return 3.14 * radius * radius;
    }
}

public class Override {
    public static void main(String args[]) {
        Rectangle obj = new Rectangle(2, 4);
        System.out.println(obj.calArea()); // Output: 8.0
        
        Circle c1 = new Circle(5);
        System.out.println(c1.calArea()); // Output: 78.5
    }
}
