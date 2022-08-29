import java.util.Stack;

//Here, I'm going to write a class that implements a stack data structure for storing integers
//push method for adding an item to the stack, pop method for removing from the top of the stack
//first in, last out data structure, internally, store data with an array
public class StackOfIntegers {

    private int[] elements;
    private int size;

    public static final int DEFAULT_CAPACITY = 16;

    public StackOfIntegers() {
        this(DEFAULT_CAPACITY);
    }
     public StackOfIntegers(int capacity) {
        elements = new int[capacity];
     }

     public boolean empty() {
        return size == 0;
     }
     public int getSize() {
        return size;
     }

     public int peek() {
        return elements[size - 1];
     }

     //pop is slighty more complicated because its going to return the element that is at the top and then
    //remove it. that means the top of the stack will be a new integer
    public int pop() {
        return elements[--size];
    }
    public int push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        return elements[size++] = value;
    }

    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();

        for (int i=0; i<10; i++) {
            System.out.print(i + " ");
            stack.push(i);
        }
        System.out.println();
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");

        }
    }
}
//A Stack stores data in a first in last out fashion. Methods for manipulating the top of stack only
//Internally, store data in an array. need to keep track of the index to the top of the stack
//need to resize the array when the stack becomes full