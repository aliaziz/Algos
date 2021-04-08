import java.util.*;

class LRUCache extends LinkedHashMap<Integer, Integer> {
    private int capacity;
    private Deque<Integer> d = new LinkedList<>();
    private Map<Integer, Integer> map = new HashMap<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
       int [][] a = new int[][]{};

       Arrays.sort(a, (s, y) -> Integer.compare(a[1][0], a[1][1]));
    }

    public int get(int key) {
        if(d.contains(key)) {
            d.remove(key);
            d.offerLast(key);
            return map.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        if(map.size() >= capacity && !map.containsKey(key)) {
            int newKey = d.pollFirst();
            map.remove(newKey);
        }
        d.offerLast(key);
        map.put(key, value);
        System.out.println(map);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return capacity < size();
    }
}