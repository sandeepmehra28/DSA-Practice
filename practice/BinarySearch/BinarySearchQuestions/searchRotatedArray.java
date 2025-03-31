package BinarySearch.BinarySearchQuestions;

public class searchRotatedArray {
    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 1, 2, 3, 3,4, 5, 6};
       // System.out.println(ra(arr));
        System.out.println(Search_In_Rotated_Array(arr,5));
    }

    static int ra(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid + 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    static int Search_In_Rotated_Array(int[] arr, int target){
        int start= 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if (target==arr[mid]){
                return mid;
            }
            if(arr[start]<=arr[mid]){
                if(target>=arr[start]&&target<arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }else {
                if(target>arr[mid]&&target<=arr[end]){
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}