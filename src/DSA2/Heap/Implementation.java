package DSA2.Heap;

import java.util.Arrays;

class MinHeap{
    private int[] values;
    private int size;
    private int capacity;

    public MinHeap(int capacity) {
        this.values = new int[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    public int parent(int index) {
        return (index - 1)/2;
    }

    public int left(int index) {
        return (2 * index + 1);
    }

    public int right(int index) {
        return (2 * index + 2);
    }

    // Insert Operation
    public void insert(int value) {
        if(size == capacity) return;
        size++;
        values[size-1] = value;
        for(int i=size-1; i != 0 && values[parent(i)] > values[i]; i = parent(i)) {
            swap(i,parent(i));
        }

    }

    // Extract min
    public int extractMin() {
        if(size == 0) return Integer.MAX_VALUE;
        else if(size == 1) {
            size--;
            return values[0];
        }

        int last = values[size-1];
        int temp = values[0];
        values[0] = last;
        size--;
        heapify(0);
        return temp;
    }

    // Decrease key
    public void decrease(int i, int value) {
        values[i] = value;
        while(i !=0 && values[parent(i)] >  values[i]) {
            swap(i,parent(i));
            i  = parent(i);
        }
    }

    // Delete
    public void delete(int index) {
        values[index] = Integer.MAX_VALUE;
        while(index != 0 && values[index] > values[parent(index)]) {
            swap(index,parent(index));
            index = parent(index);
        }
        swap(index,size-1);
        size--;
        heapify(0);
    }

    // Heap-ify
    public void heapify(int idx) {
        int lt = left(idx);
        int rt = right(idx);
        int smallest = idx;
        if(lt < size && values[lt] < values[smallest]) {
            smallest = lt;
        }
        if(rt < size && values[rt] < values[smallest]) {
            smallest = rt;
        }
        if(smallest != idx) {
            swap(idx,smallest);
            heapify(smallest);
        }

    }

    // swap method
    public void swap(int idxOne, int idxTwo) {
        int temp = values[idxOne];
        values[idxOne] = values[idxTwo];
        values[idxTwo] =  temp;
    }

    public void print() {
        System.out.println(Arrays.toString(values));
    }
}

public class Implementation {
    public static void main(String[] args) {
        MinHeap myHeap = new MinHeap(5);
        myHeap.insert(10);
        myHeap.insert(5);
        myHeap.insert(2);
        myHeap.insert(100);
        myHeap.insert(6);
        myHeap.insert(1000);
        myHeap.print();
    }
}
