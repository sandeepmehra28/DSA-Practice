package BinarySearch.BinarySearchQuestions;

public class occur {
    public static void main(String[] args) {
      int [] arr = {1,2,3,3,3,4,4,4,4,5,6};
      int firstIndex = firstIndex(arr,4);
      int lastIndex = lastIndex(arr,4);
//        System.out.println(firstIndex+" "+lastIndex);
        System.out.println("your first index: "+firstIndex);
        System.out.println("your last index: "+lastIndex);
        System.out.println(lastIndex-firstIndex+1);
    }
    static  int firstIndex(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target==arr[mid]){
                ans = mid;
                end = mid-1;
            } else if (target>arr[mid]) {
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return ans;
    }
    static int lastIndex(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ans =-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target==arr[mid]){
                ans = mid;
                start = mid+1;
            } else if (target<arr[mid]) {
                end = mid-1;
            }else {

                start = mid+1;
            }
        }
        return ans;
    }
}
