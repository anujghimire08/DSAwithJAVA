package Queues;

public class MinPriorityQueueViaArray {
    private int[] arr;
    private int size;

    MinPriorityQueueViaArray(int capacity) {
        arr = new int[capacity];
    }

    boolean isFull() {
        return size == arr.length;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void add(int val) {
        if (isFull()) {
            System.out.println("Queue Full");
            return;
        }
        arr[size++] = val;
    }

    int remove() {
        if (isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        }
        int minIdx = 0;
        for (int i = 1; i < size; i++) {
            if (arr[i] < arr[minIdx]) {
                minIdx = i;
            }
        }
        int minVal = arr[minIdx];
        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        return minVal;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        }
        int minIdx = 0;
        for (int i = 1; i < size; i++) {
            if (arr[i] < arr[minIdx]) {
                minIdx = i;
            }
        }
        int topVal = arr[minIdx];
        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        return topVal;
    }

    int getSize() {
        return size;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue Empty");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        MinPriorityQueueViaArray pqa = new MinPriorityQueueViaArray(5);
        pqa.add(20);
        pqa.add(10);
        pqa.add(5);
        pqa.add(50);
        pqa.add(6);
        System.out.println("isEmpty: " + pqa.isEmpty());
        pqa.display();
        System.out.println("Size: " + pqa.getSize());
        System.out.println("Removed Val: " + pqa.remove());
        System.out.println("Size: " + pqa.getSize());
        pqa.display();
        System.out.println("Top El: " + pqa.peek());
        System.out.println(pqa.isFull());
    }
}
