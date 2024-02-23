package DataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class HeapTree {
    private int[] heap;
    private int size;
    private int capacity;
    public HeapTree(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    public void insert(int element) {
        if (size == capacity) {
            System.out.println("Heap is full. Cannot insert element.");
            return;
        }

        heap[size] = element;
        size++;
        heapifyUp(size - 1);
    }

    private void heapifyUp(int index) {
        int parentIndex = (index - 1) / 2;

        while (index > 0 && heap[index] > heap[parentIndex]) {
            swap(index, parentIndex);
            index = parentIndex;
            parentIndex = (index - 1) / 2;
        }
    }

    private void swap(int index1, int index2) {
        int temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }

    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
    public void delete(int data) {
    	for(int i=0;i<heap.length;i++) {
    		if(heap[i]==data) {
    			
    		}
    	}
    }
}



