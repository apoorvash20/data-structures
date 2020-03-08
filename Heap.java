/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Apoorva
 */
public class Heap {
    int[] arr;
    int size;
    Heap(int[] a){
      arr=a;  
      size=a.length;
    }
    
    public int left(int index){
        return (2*index+1);
    }
    public int right(int index){
        return (2*index+2);
    }
    public int parent(int index){
        return (index-1)/2;
    }
    
    public void swap(int a, int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
    }
    
    public void minHeapify(int index){
        int lt=left(index),rt=right(index);
        int min=index;
        if(lt<size && arr[lt]<arr[min]){
            min=lt;
        }
        if(rt<size && arr[rt]<arr[min]){
            min=rt;
        }
        if(min!=index){
            int temp=arr[index];
            arr[index]=arr[min];
            arr[min]=temp;
            minHeapify(min);
            
        }
        
    }
    public void maxHeapify(int index){
        int lt=left(index),rt=right(index);
        int max=index;
        if(lt<size && this.arr[lt]>arr[max]){
            max=lt;
        }
        if(rt<size && this.arr[rt]>arr[max]){
            max=rt;
        }
        if(max!=index){
            int temp=arr[index];
            arr[index]=arr[max];
            arr[max]=temp;
            maxHeapify(max);
            
        }
        
    }
    public void builtMinHeap(){
        for(int i=parent(size-1);i>=0;i--){
            minHeapify(i);
        }
    
    }
    public void builtMaxHeap(){
        for(int i=(size-2)/2;i>=0;i--){
            maxHeapify(i);
        }
    
    }
    public void heapSort(){
        builtMaxHeap();
        
        for(int i=size-1;i>=0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            size--;
            maxHeapify(0);
        }
        size=arr.length;
        
    }
    public void print(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
            
    }
    

    
}
