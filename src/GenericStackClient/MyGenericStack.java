package GenericStackClient;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack {
    private final LinkedList<String> stack;
    public MyGenericStack() {
        stack = new LinkedList<>();
    }
    public void push(String element) {
        stack.addFirst(element);
    }
    public Object pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public int size() {
        return stack.size();
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    static void stackOfIStrings() {
        MyGenericStack stack = new MyGenericStack();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        System.out.print("1.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n1.3. Size of stack after pop operations : " + stack.size());
    }
    static void stackOfIntegers() {
        MyGenericStack stack = new MyGenericStack();
        stack.push(String.valueOf(5));
        stack.push(String.valueOf(4));
        stack.push(String.valueOf(3));
        stack.push(String.valueOf(2));
        stack.push(String.valueOf(1));
        System.out.println("2.1. Size of stack after push operations: " + stack.size());
        System.out.print("2.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n3.3 Size of stack after pop operations : " + stack.size());
    }

}
