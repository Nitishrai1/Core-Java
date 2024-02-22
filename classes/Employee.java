package classes;

class Employee {
    public int empno;
    public String empname;
    public int empphonenumber;

    public void setempno(int n){
        this.empno=n;
    }

    public void setempphonenumber(int number){
        this.empphonenumber=number;
    }

    public void setempname(String name){
        this.empname=name;
    }
    public int getempno(){
        return this.empno;
    }
}
class HR extends Employee{
    String role;
    String speciality;

    void setrole(String s){
        this.role=s;
    }

    void setspeciality(String s){
        this.speciality=s;
    }
}


public class Main{
    public static void main(String[] args){
        Employee e1=new Employee();
        e1.setempno(123); 
        System.out.println(e1.getempno());
    }
}



