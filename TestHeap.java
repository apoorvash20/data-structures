/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Apoorva
 */
public class TestHeap {
    public static void main(String[] args){
        Heap h=new Heap();
        h.builtMaxHeap();
        h.print();
        h.builtMinHeap();
        h.print();
        h.heapSort();
        h.print();
    }
}
