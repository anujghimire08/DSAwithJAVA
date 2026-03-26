package Recursion;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int[] rawArr = {2, 9, 10, 34, 1, 4, 5};
        Arrays.sort(rawArr);
        int result = search(rawArr, 4, 0, rawArr.length);
        System.out.println(result);
    }

    static int search(int[] arr, int target, int l, int h) {
        if (l > h) return -1;
        int mid = l + (h - l) / 2;
        if (arr[mid] == target) return mid;
        if (arr[mid] > target) return search(arr, target, l, mid - 1);
        else return search(arr, target, mid + 1, h);
    }
}
