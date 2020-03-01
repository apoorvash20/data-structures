/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Apoorva
 */

public class Test {
    public static void main(String args[]){
       
        QDll q=new QDll();
        QDll a=new QDll();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.display();
        q.dequeue();
        q.display();
        q.dequeue();
        q.display();
        q.dequeue();
        q.display();
        q.dequeue();
        q.display();
        a.enqueue(5);
        a.enqueue(6);
        a.enqueue(7);
        a.display();
        a.dequeue();
        a.display();
        a.dequeue();
        a.display();
        a.dequeue();
        a.display();
        a.enqueue(1);
        a.enqueue(12);
        a.enqueue(13);a.enqueue(14);
        a.delete(13);
        a.display();
        a.delete(12);
        a.display();
        a.delete(1);
        a.display();
        a.delete(14);
        a.display();
    }
    }

