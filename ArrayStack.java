import java.util.Scanner;

public class ArrayStack {
    protected int capacity;
    protected int[] stack;
    protected int top = -1;

    public ArrayStack(int cap) {
        capacity = cap;
        stack = new int[capacity];
    }

    public int size() {
        return (top + 1);
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is Overflow. Not possible to insert in Full stack");
        } else {
            stack[++top] = data;
            System.out.println("Element is inserted");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Overflow. Not possible to insert in Full stack");
            return -1;
        } else {
            return stack[top--];
        }
    }

    public boolean isFull() {
        return size() == capacity;
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Underflow. No elements to display in Empty Stack");
        } else {
            System.out.println("Stack Elements: Top of the Stack Element is");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayStack s = new ArrayStack(5);
        int data, ch;

        do {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display Stack");
            System.out.println("4. Exit");
            System.out.print("\nEnter your choice:");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter the element to insert:");
                    data = sc.nextInt();
                    s.push(data);
                    break;
                case 2:
                    data = s.pop();
                    if (data != -1)
                        System.out.println("Popped Element: " + data);
                    break;
                case 3:
                    s.display();
                    break;
            }
        } while (ch < 4);

        sc.close();
    }
}
