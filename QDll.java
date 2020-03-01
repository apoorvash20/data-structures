/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Apoorva
 */

class qnode{
   int data;
   qnode next;
   qnode prev;
   qnode(int x){
       data=x;
       
   }
}
public class QDll{
    qnode head;
    qnode tail;
    int size;
    void enqueue(int x){
        qnode key = new qnode(x);
        if(head==null){
            head=key;
            tail=key;
            size++;
        }
        else{
            key.next=head;
            head.prev=key;
            head=key;
            size++;
        }
    }
    
    
    int dequeue(){
        if(tail==null){
            return 0;
        }
        else if(tail.prev==null)
            {
                tail=null;
                head=null;
                size--;
                return 0;
                
            }
            qnode x=tail;
            tail=tail.prev;
            (tail.next).prev=null;
            tail.next=null;
            size--;
            return x.data;
    }
    void display(){
        if(head==null){
            System.out.println("Nothing to display");
        }
        else{
            qnode temp;
            temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        System.out.println();
    }
    void delete(int x)
    {
        qnode temp=head;
        while(temp.data!=x)
            temp=temp.next;
        if(temp.data==head.data){
            head=null;
            size--;
        }
        else if(temp.data==tail.data){
            (temp.prev).next=null;
            tail=temp.prev;
            temp.prev=null;
            size--;
        }
        else if(head==null && tail==null)
            System.out.println();
        else{
            (temp.prev).next=temp.next;
            (temp.next).prev=temp.prev;
            temp.prev=null;
            temp.next=null;
            size--;
        }
        
    }
    boolean search(int x){
        qnode temp=head;
        if(head==null){
            return false;
        }
       for(;temp!=null;temp=temp.next){
           if(temp.data==x)
               return true;
       }
       return false;
    }
     
}



