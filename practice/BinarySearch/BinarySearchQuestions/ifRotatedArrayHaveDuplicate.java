package BinarySearch.BinarySearchQuestions;

public class ifRotatedArrayHaveDuplicate {
    public static void main(String[] args) {
        int[] arr = {6,6,7,8,8,9,1,2,3,4,5};
        int target = 3;
        int ans1 = searchArray2(arr, target);
        boolean ans2 = searchArray1(arr,target);
        System.out.println("in boolean: "+ans2);
        System.out.println("in index: "+ans1);
    }
    static boolean searchArray1(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return true;
            }

            // Handle duplicates: if start, mid, and end are all the same, we can't determine which part is sorted
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start++;
                end--;
            }
            // Left side is sorted
            else if (arr[start] <= arr[mid]) {
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // Right side is sorted
            else {
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }
    static int searchArray2(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid;
                return ans;
            }

            // Handle duplicates: if start, mid, and end are all the same, we can't determine which part is sorted
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start++;
                end--;
            }
            // Left side is sorted
            else if (arr[start] <= arr[mid]) {
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // Right side is sorted
            else {
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return ans;
    }
}
