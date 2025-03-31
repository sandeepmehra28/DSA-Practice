package BinarySearch.BinarySearchQuestions;

public class First_Last_Index2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,5,6,7};
        int target  = 4;
        System.out.println(findIndex(arr,target,true));
    }
    static int findIndex(int [] arr, int target, boolean isAns){
        int start = 0;
         int end = arr.length-1;
         int ans = -1;
         while(start<=end){
             int mid = start+(end-start)/2;
             if(target==arr[mid]){
                 ans = mid;
                 if(isAns){
                     end = mid-1;
                 }else {
                     start = mid+1;
                 }
             }else if (target<arr[mid]){
                 end = mid-1;
             }else {
                 start = mid+1;
             }
         }
        return ans;
    }
}
