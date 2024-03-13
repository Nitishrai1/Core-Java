// 
abstract class Employee {
    protected String name;
    protected int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public abstract double calculateSalary();

    public abstract void displayInfo();
}

class Manager extends Employee {
    private double baseSalary;
    

    public Manager(String name, int employeeId, double baseSalary) {
        super(name, employeeId);
        this.baseSalary = baseSalary;
        
    }

   
    public double calculateSalary() {
        return baseSalary ;
    }

    
    public void displayInfo() {
        System.out.println("Manager Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: $" + calculateSalary());
    }
}

class Programmer extends Employee {
    private double monthlySalary;

    public Programmer(String name, int employeeId, double monthlySalary) {
        super(name, employeeId);
        this.monthlySalary = monthlySalary;
    }

   
    public double calculateSalary() {
        return monthlySalary;
    }

    
    public void displayInfo() {
        System.out.println("Programmer Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Monthly Salary: $" + calculateSalary());
    }
}

public class Abstruct{
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", 10003, 3000);
        manager.displayInfo();

        System.out.println();

        Programmer programmer = new Programmer("Jane Smith", 2001, 4000);
        programmer.displayInfo();
    }
}
