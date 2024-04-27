// import java.*;
class Keyvalue<K,V>{
    private K key;
    private V value;
    public Keyvalue(K key, V value){
        this.key=key;
        this.value=value;
    }
    public K getkey(){
        return this.key;
    }
    public V getvalue(){
        return this.value;
    }
    
}
public class code3 {
    public static void main(String args[]){
        Keyvalue<String ,Integer> obj=new Keyvalue<>("nitish", 1);
        System.out.println(obj.getkey()+" "+obj.getvalue());

    }
    
}
