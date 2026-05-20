package Queues;

public class QueueViaArray {
    private int rear, front, size;
    private int[] arr;

    QueueViaArray(int capacity) {
        arr = new int[capacity];
    }

    void add(int val) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }
        arr[rear++] = val;
        size++;
    }

    int remove() {
        if (isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        }
        size--;
        return arr[front++];
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        }
        return arr[front];

    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == arr.length;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue Empty");
        } else {
            for (int i = front; i < rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        QueueViaArray qa = new QueueViaArray(5);
        System.out.println(qa.isEmpty());
        qa.add(10);
        qa.add(20);
        qa.add(30);
        qa.add(40);
        qa.add(50);
        qa.display();
        qa.remove();
        qa.display();
        System.out.println("top value: " + qa.peek());
        System.out.println(qa.isEmpty());
        System.out.println(qa.isFull());
    }
}
/*
| Issue                    | Explanation                         |
| ------------------------ | ----------------------------------- |
| ❌ Space waste            | Removed elements leave unused space |
| ❌ Cannot reuse array     | `rear` only increases               |
| ❌ Possible index error   | `rear` exceeds array length         |
| ❌ Inefficient memory use | Even when queue has space           |
*/