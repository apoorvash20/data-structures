/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Apoorva
 */
class node{
   int data;
   node next;
   node(int x){
       data=x;
   }
   
}
class Sll{
    node head;
    void ins_at_beg(int x){
        node key = new node(x);
        if(head==null){
            head=key;
        }
        else{
            key.next=head;
            head=key;
        }
    }
    
    void ins_at_end(int x){
        node key=new node(x);
        
        if(head==null){
            head=key;
        }
        else{
            node pointer;
            pointer=head;
            while(pointer.next!=null)
                pointer=pointer.next;
            pointer.next=key;
        }
    }
    
    void ins_at_specloc(int x, int loc){
        node key =new node(x);
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            node pointer=head;
            while(pointer.data!=loc)
                pointer=pointer.next;
            key.next=pointer.next;
            pointer.next=key;
            
        }
    }
    
    void delete(int x)
    {
        node pointer= head;
        if(pointer.data==x){
            head=pointer.next;
        }
        while(pointer.data!=x)
            pointer=pointer.next;
        if(pointer.next==null){
            node q=head;
            while( q.next!=pointer)
                q=q.next;
            q.next=null;
        }
        else{
            node q=head;
            while(q.next!=pointer)
                q=q.next;
            q.next=pointer.next;
        }
        
    }
    
    void display(){
        if(head==null){
            System.out.println("Nothing to display");
        }
        else{
            node temp;
            temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        System.out.println();
    }
}
public class SllTest {
    public static void main(String args[]){
        Sll list=new Sll();
        list.ins_at_end(10);
        list.ins_at_beg(20);
        list.ins_at_specloc(30, 20);
        list.display();
        list.delete(30);
        list.display();
    }
}
