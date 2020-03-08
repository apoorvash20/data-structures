/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Apoorva
 */
class Tnode{
    Tnode[] child=new Tnode[26];
    boolean isEnd;
}
class Trie{
    //Tnode root=new Tnode();
    void insert(Tnode root, String key){
        Tnode cur=root;
        for(int i=0;i<key.length();i++){
            int index=key.charAt(i)-'a';
            if(cur.child[index]==null)
                cur.child[index]=new Tnode();
            cur=cur.child[index];
        }  
            cur.isEnd=true;
        
    }
    
    boolean search(Tnode root,String key){
        Tnode cur=root;
        for(int i=0;i<key.length();i++){
            int index=key.charAt(i)-'a';
            if(cur.child[index]==null)
                return false;
            cur=cur.child[index];
        }  
            return cur.isEnd;
        
    }
    
    Tnode delete(Tnode root,String key,int i){
        if(root==null)
            return null;
        if(i==key.length()){
            root.isEnd=false;
            if(isEmpty(root)==true){
                root=null;
            }
            return root;
        }
        int index=key.charAt(i)-'a';
        root.child[index]=delete(root,key,i+1);
        if(isEmpty(root)==true && root.isEnd==false)
            root=null;
        return root;
        
    }
    boolean isEmpty(Tnode root){
        for(int i=0;i<26;i++)
            if(root.child[i]!=null)
                return false;
        return true;
    }
}
public class TrieTest {
    public static void main(String args[]){
        Tnode root=new Tnode();
        Trie t=new Trie();
        t.insert(root,"bad");
        t.insert(root,"bat");
        t.insert(root,"home");
        t.insert(root,"homework");
        t.insert(root,"yellow");
        System.out.println( t.search(root,"bad"));
        System.out.println(t.search(root,"hom"));
        System.out.println(t.search(root,"home"));
        t.delete(root, "home", 0);
        System.out.println(t.search(root,"home"));
                            
    }
    
}
