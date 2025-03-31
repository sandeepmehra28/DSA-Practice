package BinarySearch.BinarySearchQuestions;

import java.util.Arrays;

public class search_In_Range {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 4, 5, 5};
        int target = 6;
//        System.out.printf("first index will be:%d\n" +
//                "last index will be:%d", firstIndex(arr, target), lastIndex(arr, target));
        int[] ans = new int[2];
        ans[0]=firstIndex(arr,target);
        ans[1]=lastIndex(arr,target);
        //System.out.println("["+firstIndex(arr,target)+","+lastIndex(arr,target)+"]");
        System.out.println(Arrays.toString(ans));
    }

    static int firstIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                ans = mid;
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    static int lastIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                ans = mid;
                start = mid + 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
