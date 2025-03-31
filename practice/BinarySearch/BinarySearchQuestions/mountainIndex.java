package BinarySearch.BinarySearchQuestions;

public class mountainIndex {
    public static void main(String[] args) {
      int [] arr = {1,2,3,4,7,8,9,4,2};
        System.out.println(peakIndexInMountainArray(arr));
    }
    static int peakIndex(int [] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }else {
                end = mid;
            }
        }
        return start;
    }
    static int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid!=0 && mid!=n-1 && arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }else if(mid!=n-1 && arr[mid]<arr[mid+1]){ //inc
                start = mid+1;
            }else{ //dec
                end = mid-1;
            }
        }
        return -1; //never be returned
    }
}
