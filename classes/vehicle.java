package classes;

public class vehicle {
    int modelnumber;
    String model;
    vehicle(int n,String s){
        this.modelnumber=n;
        this.model=s;
    }


    public int getmodelnumber(){
        return modelnumber;

    }
    public String getmodel(){
        return model;
    }

    public static void main(String[] args){
        vehicle v1=new vehicle(21,"verna");
        System.out.println(v1.getmodelnumber());
        System.out.println(v1.getmodel());

    }

    
}
