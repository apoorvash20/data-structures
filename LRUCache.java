/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Apoorva
 */



public class LRUCache {
        QDll q;
    int cap;
    LRUCache(int k){
        q=new QDll();
        cap=k;
    }
    void insert(int x){
        if(q.size<cap)
            q.enqueue(x);
        else{
            q.dequeue();
            q.enqueue(x);
        }
    }
    boolean doesExist(int x){
        return q.search(x);
    } 
    int fetch(int x){
        if(doesExist(x)){
            if(q.head.data==x)
                return x;
            else{         
                q.delete(x);
                insert(x);
                return(x);
            }
        }
        else{
            insert(x);
            return(x);
        }
    }
}
