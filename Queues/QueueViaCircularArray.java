package Queues;

public class QueueViaCircularArray {
    private int rear, front, size;
    private int[] arr;

    QueueViaCircularArray(int capacity) {
        arr = new int[capacity];
    }

    void add(int val) {
        if (size == arr.length) {
            System.out.println("Queue Full");
            return;
        }
        arr[rear++] = val;
        if (rear == arr.length) rear = 0;
        size++;
    }

    int remove() {
        if (isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        }
        int frontVal = arr[front++];
        if (front == arr.length) front = 0;
        size--;
        return frontVal;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        }
        return arr[front];
    }

    int getSize() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == arr.length;
    }

    void display() {
        if (!isEmpty()) {
            for (int i = 0; i < size; i++) {
                System.out.print(arr[(front + i) % arr.length] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Empty Queue");
        }
//            if (front >= rear) {
//                for (int i = front; i < arr.length; i++) {
//                    System.out.print(arr[i] + " ");
//                    // front -> end
//                }
//                for (int i = 0; i < rear; i++) {
//                    System.out.print(arr[i] + " ");
//                    // rear-1
//                }
//                System.out.println();
//
//            } else {
//                for (int i = front; i < rear; i++) {
//                    System.out.print(arr[i] + " ");
//                }
//                System.out.println();
//            }
//        } else {
//            System.out.println("Empty Queue");
//        }
    }

    public static void main(String[] args) {
        QueueViaCircularArray qca = new QueueViaCircularArray(5);
        qca.add(10);
        qca.add(20);
        qca.add(30);
        qca.add(40);
        qca.add(50);
        qca.display();
        System.out.println(qca.isFull());
        qca.remove();
        qca.display();
        System.out.println(qca.getSize());
        System.out.println(qca.isEmpty());
        System.out.println(qca.isFull());
    }
}