/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Apoorva
 */
public class TestLRU {
    public static void main(String args[]){
        LRUCache lru=new LRUCache(3);
        lru.fetch(1);
        lru.fetch(2);
        lru.fetch(1);
        lru.q.display();
        lru.fetch(1);
        lru.q.display();
        lru.fetch(3);
        lru.q.display();
        lru.fetch(3);
        lru.q.display();
        lru.fetch(4);
        lru.q.display();
        lru.fetch(5);
        lru.q.display();
        System.out.println(lru.doesExist(4));
        System.out.println(lru.doesExist(1));
        lru.fetch(4);
        lru.q.display();
        lru.fetch(3);
        lru.q.display();
        
    }
}
