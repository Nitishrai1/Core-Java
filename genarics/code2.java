// package genarics;
// WAP to create a generaic class that have a key value pair object
class KeyValuePair<K, V> {
    private K key;
    private V value;

    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

public class code2 {
    public static void main(String[] args) {
        KeyValuePair<Integer, String> obj1 = new KeyValuePair<>(1, "nitish");
        System.out.println(obj1.getKey() + " " + obj1.getValue());
    }
}
