package app.entity;

public class Client<K,V> {

    private final key;
    private final V value;

    public Client(K key, value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
