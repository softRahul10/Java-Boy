package DSA.Stack.Implementation.KingStack;

import java.util.EmptyStackException;

public class Implementation {
    public static void main(String[] args) {
        MyStack s = new MyStack(4);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.print();
    }
}

// My stack class
class MyStack{
    private int[] arr;
    private int top;
    private int size;

    public MyStack(int n) {
        this.arr = new int[n];
        this.top = -1;
        this.size = 0;
    }

    // Push
    public void push(int data) {
        if(this.size == this.arr.length) {
            throw new StackOverflowError("Stack is full! You can't add data now");
        }
        top++;
        size++;
        this.arr[top] = data;
    }

    // Pop
    public int pop() {
        if(this.size == 0) {
            throw new EmptyStackException();
        }
        int res = this.arr[this.top];
        top--;
        size--;
        return res;
    }

    // Peek
    public int peek() {
        if(this.size == 0) {
            return -1;
        }
        return this.arr[this.top];
    }

    // isEmpty
    public boolean isEmpty() {
        return this.size == 0;
    }

    // size
    public int size() {
        return this.size;
    }

    // print
    public void print() {
        System.out.print(" [ ");
        for (int i = 0; i < this.size; i++) {
            System.out.print( this.arr[i] + " ,");
        }
        System.out.print(" ] ");
    }
}
