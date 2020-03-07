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
    int[] arr={1,3,5,4,6,13,10,9,8,15,17};
    int size=arr.length;
    
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
            swap(arr[index],arr[min]);
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
            swap(this.arr[index],this.arr[max]);
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
        int len=size;
        for(int i=len-1;i>=0;i--){
            swap(arr[i],arr[0]);
            len--;
            maxHeapify(0);
        }
        
    }
    public void print(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
            
    }
    

    
}
