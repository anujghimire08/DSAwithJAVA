package Heaps;

import java.util.Arrays;

class Heap {
    private int[] arr;
    private int idx = 1;

    Heap(int capacity) {
        arr = new int[capacity + 1];
        Arrays.fill(arr, Integer.MAX_VALUE);
    }

    void add(int val) {
        arr[idx++] = val;
        // rearrangement
        int root = idx - 1;
        while (root != 1) {
            int parent = root / 2;
            if (arr[root] < arr[parent]) {
                int temp = arr[root];
                arr[root] = arr[parent];
                arr[parent] = temp;
                root = parent;
            } else break;
        }
    }

    int remove() {
        if (idx == 1) {
            System.out.println("Empty Heap");
            return -1;
        }
        int min = arr[1];
        arr[1] = arr[idx - 1];
        idx--;
        // rearrangement
        int root = 1;
        while (root <= size()) {
            int left = 2 * root, right = 2 * root + 1;
            int leftVal = (left <= size()) ? arr[left] : Integer.MAX_VALUE;
            int rightVal = (right <= size()) ? arr[right] : Integer.MAX_VALUE;
            if (arr[root] < leftVal && arr[root] < rightVal) break;
            else {
                if (leftVal < rightVal) {
                    // swap through left child
                    int temp = arr[root];
                    arr[root] = arr[left];
                    arr[left] = temp;
                    root = left;
                } else {
                    // swap through right child
                    int temp = arr[root];
                    arr[root] = arr[right];
                    arr[right] = temp;
                    root = right;
                }
            }
        }
        return min;
    }

    int peek() {
        return arr[1];
    }

    void display() {
        for (int i = 1; i < idx; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    int size() {
        return idx - 1;
    }
}

public class MinHeapImplementation {
    public static void main(String[] args) {
        Heap h = new Heap(10);
        h.add(10);
        h.add(15);
        h.add(8);
        h.add(9);
        h.add(4);
        h.display();
        System.out.println(h.remove());
        h.display();
        h.add(2);
        h.display();
        System.out.println(h.remove());
        h.display();
    }
}
