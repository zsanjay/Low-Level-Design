package org.sanjay.lld.design.problems.lru_cache;

public class LRUCacheDemo {

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(3);
        lruCache.put(1 , 1);
        lruCache.put(2 , 2);
        lruCache.put(3 , 3);

        lruCache.put(4 , 4);
        lruCache.put(5 , 5);

        int value = lruCache.get(4);
        System.out.println("value "+ value);
    }
}
