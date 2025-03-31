package BinarySearch.BinarySearchQuestions;

public class searchMountain {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,7,8,9,3,2,1,0};
        int target = 2;
        System.out.println(search(arr,target));
    }
   static   int search(int[] arr, int target) {
       int peak = peakIndex(arr);
       int firstTry = bs(arr,target,0,peak);
       if(firstTry != -1) {
           return firstTry;
       }
       return bs(arr,target,peak+1, arr.length-1);
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
    static int bs (int [] arr,int target, int start, int end){
            boolean isAsc = arr[start]<=arr[end];
            while (start<=end){
                int mid = start+(end-start)/2;
                if(target==arr[mid]){
                    return mid;
                }
                if(isAsc){
                    if(target<arr[mid]){
                        end = mid-1;
                    }else {
                        start = mid+1;
                    }
                }
                else {
                    if(target>arr[mid]){

                        start = mid+1;
                    }else {
                        end = mid-1;
                    }
                }
            }return -1;
        }
}
