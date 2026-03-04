package Stack;

public class ArrayStack {
    private int[] arr;
    private int idx;

    ArrayStack(int size) {
        arr = new int[size];
    }

    void push(int val) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[idx++] = val;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[idx - 1];
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[--idx];
    }

    int size() {
        return idx;
    }

    boolean isEmpty() {
        return idx == 0;
    }

    boolean isFull() {
        return idx == arr.length;
    }

    void display() {
        for (int i = 0; i < idx; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayStack st = new ArrayStack(4);

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        System.out.println(st.size() + " size");
        st.display();

        System.out.println("popped: " + st.pop());

        System.out.println(st.size() + " size");
        st.display();
        System.out.println(st.peek() + " peek el");
    }
}