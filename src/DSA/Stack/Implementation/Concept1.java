package DSA.Stack.Implementation;

public class Concept1 {

    public static void main(String[] args) {
       MyStack s = new MyStack(4);
       s.printStack();

    }

}

/* Stack Implementation : Array */
class MyStack{
    private int[] arr;
    private int size;
    private int index;
    private int TOP;

    public MyStack(int capacity){
        arr = new int[capacity];
        TOP = -1;
        index = 0;
        size = 0;
    }

    /* Stack Methods */
    // Push
    public void push(int ele) {
        if(index == arr.length) {
            return;
        }
        arr[index++] = ele;
        TOP++;
        size++;
    }

    // Pop
    public int pop() {
        if(this.isEmpty()) {
           return -1;
        }
        int value = arr[TOP];
        size--;
        TOP--;
        index--;
        return value;
    }

    // Peek
    public int peek() {
        if(this.isEmpty()) {
           return -1;
        }
        return this.arr[this.TOP];
    }

    // size
    public int size() {
        return this.size;
    }

    // isEmpty
    public boolean isEmpty() {
        if(this.size == 0){
            return true;
        }
        return false;
    }

    // print
    public void printStack() {

        System.out.print(" \n [ ");
        for(int i=0; i<this.size(); i++) {
            System.out.print(" " + this.arr[i] + " ");
        }
        System.out.print(" ] \n ");


    }

}
