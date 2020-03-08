/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Apoorva
 */
class node1{
   int data;
   node1 next;
   node1 prev;
   node1(int x){
       data=x;
   }
}

class Dll{
    node1 head;
    void ins_at_beg(int x){
        node1 key = new node1(x);
        if(head==null){
            head=key;
        }
        else{
            key.next=head;
            head.prev=key;
            head=key;
        }
    }
    
    void ins_at_end(int x){
        node1 key=new node1(x);
        
        if(head==null){
            head=key;
        }
        else{
            node1 pointer;
            pointer=head;
            while(pointer.next!=null)
                pointer=pointer.next;
            pointer.next=key;
            key.prev=pointer;
        }
    }
    
    void ins_at_specloc(int x, int loc){
        node1 key =new node1(x);
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            node1 pointer=head;
            while(pointer.data!=loc)
                pointer=pointer.next;
            key.next=pointer.next;
            key.prev=(pointer.next).prev;
            (pointer.next).prev=key;
            pointer.next=key;
            
            
        }
    }
    
    void delete(int x)
    {
        node1 pointer= head;
        if(pointer.data==x){
            head=pointer.next;
            head.prev=null;
            
        }
        while(pointer.data!=x)
            pointer=pointer.next;
        if(pointer.next==null){
            node1 q=head;
            while( q.next!=pointer)
                q=q.next;
            q.next=null;
            pointer.prev=null;
        }
        else{
            node1  q=head;
            while(q.next!=pointer)
                q=q.next;
            q.next=pointer.next;
            (pointer.next).prev=pointer.prev;
        }
        
    }
    
    void display(){
        if(head==null){
            System.out.println("Nothing to display");
        }
        else{
            node1 temp;
            temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        System.out.println();
    }


}

public class DllTest {
    public static void main(String args[]){
        Dll list=new Dll();
        list.ins_at_end(10);
        list.ins_at_beg(20);
        list.ins_at_specloc(30, 20);
        list.display();
        list.delete(30);
        list.display();
    }
}
