package classes;

class Newmain{
    int salary;
    String post;
    
    public void setVar(int slry,String post){
    this.salary=slry;
    this.post=post;
    }
    
    public int getSalary(){
    return this.salary;
    
    }
    
    public String getPost(){
    return this.post;
    }
    
    }
    
    public class hrm {
    public static void main(String[] args){
    Newmain h1=new Newmain();
    h1.setVar(10000,"Intern");
    System.out.println(h1.getPost());
    System.out.println(h1.getSalary());
    
    }
    
    
    
    }