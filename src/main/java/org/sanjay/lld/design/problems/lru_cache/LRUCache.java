package org.sanjay.lld.design.problems.lru_cache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LRUCache {
    private final int capacity;
    private Map<Integer, Node<Integer, Integer>> cache;
    private Node<Integer, Integer> head, tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new ConcurrentHashMap<>();

        head = new Node<>(0 , 0);
        tail = new Node<>(0 , 0);

        head.next = tail;
        tail.prev = head;
    }

    public synchronized int get(int key) {
        if(!cache.containsKey(key)) {
            return -1;
        }

        Node<Integer, Integer> node = cache.get(key);
        remove(node);
        insertToTail(node);
        return node.value;
    }

    public synchronized void put(int key, int value) {
        if(cache.containsKey(key)) {
            // Update existing value
            Node<Integer,Integer> node = cache.get(key);
            node.value = value;
            remove(node);
            insertToTail(node);
        } else {
            if(isCacheFull()) {
                // Evict the least recently used Node
                Node<Integer,Integer> lru = head.next;
                remove(lru);
                cache.remove(lru.key);
            }

            Node<Integer,Integer> newNode = new Node<>(key, value);
            cache.put(key, newNode);
            insertToTail(newNode);
        }
    }

    private void remove(Node<Integer,Integer> node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insertToTail(Node<Integer,Integer> node) {
        if(tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    private boolean isCacheFull() {
        return capacity == cache.size();
    }
}
