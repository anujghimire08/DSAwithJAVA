package Stack;

class GNode<T> {
    T val;
    GNode<T> next;

    GNode(T val) {
        this.val = val;
    }
}

public class GenericLinkedListStack<T> {
    GNode<T> head;
    int size;

    void push(T val) {
        GNode<T> newNode = new GNode<>(val);
        newNode.next = head;
        head = newNode;
        size++;
    }

    T peek() {
        if (head == null) {
            throw new IllegalStateException("Stack Underflow");
        }
        return head.val;
    }

    T pop() {
        if (head == null) {
            throw new IllegalStateException("Stack is empty");
        }
        T x = head.val;
        head = head.next;
        size--;
        return x;
    }

    int stackSize() {
        return size;
    }

    void display() {
        GNode<T> temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        GenericLinkedListStack<String> stringLinkedListStack = new GenericLinkedListStack<>();
        stringLinkedListStack.push("Anuj");
        stringLinkedListStack.push("BRS");
        stringLinkedListStack.push("Nischal");
        stringLinkedListStack.push("Kaushal");
        stringLinkedListStack.push("Rohan");
        stringLinkedListStack.display();
        System.out.println(stringLinkedListStack.pop() + " popped");
        stringLinkedListStack.display();
        stringLinkedListStack.push("Rohan");
        stringLinkedListStack.display();
        System.out.println(stringLinkedListStack.stackSize() + " stack size");
        System.out.println();
        System.out.println(stringLinkedListStack.peek());
    }
}
