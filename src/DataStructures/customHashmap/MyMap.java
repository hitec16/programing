package DataStructures.customHashmap;

import DataStructures.customHashmap.Entry;

public class MyMap<K, V> {

    private Entry<K, V>[] buckets;
    private final static int INITIAL_CAPACITY = 16;
    private int size = 0;

    public MyMap(int capacity) {
        buckets = new Entry[capacity];
    }

    public MyMap() {
        this(INITIAL_CAPACITY);
    }

    public void put(K key, V value) {
        int index = getHash(key);
        Entry<K, V> entry = new Entry<>(key, value, null);

        Entry<K, V> existing = buckets[index];
        if (existing != null) {
            while (existing.getNext() != null) {
                if (existing.getKey().equals(entry.getKey())) {
                    existing.setValue(entry.getValue());
                    return;
                }
                existing = existing.getNext();
            }

            if (existing.getKey().equals(entry.getKey())) {
                existing.setValue(entry.getValue());
            } else {
                existing.setNext(entry);
                size++;
            }
        } else {
            buckets[index] = entry;
            size++;
        }
    }

    public V get(K key){
        int index = getHash(key);
        Entry<K,V> entry  = buckets[index];

        while(entry != null){
            if(entry.getKey().equals(key)){
                return entry.getValue();
            }
            entry = entry.getNext();
        }
    return null;
    }

    private int getBucketSize() {
        return buckets.length;
    }

    private int getHash(K key) {
        return Math.abs(key.hashCode()) % getBucketSize();
    }
}
