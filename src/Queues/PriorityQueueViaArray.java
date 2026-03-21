package Queues;

public class PriorityQueueViaArray {
    private int size;
    private int[] arr;

    PriorityQueueViaArray(int capacity) {
        arr = new int[capacity];
    }

    void add(int val) {
        if (getSize() >= arr.length) {
            System.out.println("Full Queue");
            return;
        }
        arr[size++] = val;
    }

    int remove() {
        if (isEmpty()) {
            System.out.println("Empty Queue");
            return -1;
        }
        int maxIdx = 0;
        for (int i = 1; i < size; i++) {
            if (arr[i] > arr[maxIdx]) {
                maxIdx = i;
            }
        }
        int maxVal = arr[maxIdx];
        for (int i = maxIdx; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        return maxVal;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Empty Queue");
            return -1;
        }
        int maxIdx = 0;
        for (int i = 1; i < size; i++) {
            if (arr[i] > arr[maxIdx]) {
                maxIdx = i;
            }
        }
        return arr[maxIdx];
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
        if (isEmpty()) {
            System.out.println("Empty Queue");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PriorityQueueViaArray pqa = new PriorityQueueViaArray(5);
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
