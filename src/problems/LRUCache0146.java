package problems;

import java.util.LinkedHashMap;

public class LRUCache0146 {

    private LinkedHashMap<Integer, Integer> cache;
    private int capacity;
    
    public LRUCache0146(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<Integer, Integer>();
    }
    
    public int get(int key) {
        
        int result = cache.getOrDefault(key, -1);
        
        if (result != -1) {
            cache.remove(key);
            cache.put(key, result);
        }
        
        return result;
    }
    
    public void put(int key, int value) {
        
        if (cache.containsKey(key)) {
            cache.remove(key);
        } else if (cache.size() == capacity) {
            int remove = cache.keySet().iterator().next();
            cache.remove(remove);
        }
        
        cache.put(key, value);
    }

}