package BinarySearch;
public class searchArray {
    public static void main(String[] args) {
         int[] arr1 = {-3,-5,0,1,2,3,3,4,7,9,24,65,77};
         int target = 3;
        System.out.println(binarySearch(arr1,target));
    }
    static int binarySearch(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = start+(end-start)/2;
              if(target<arr[mid]){
                  end = mid-1;
              } else if (target>arr[mid]) {
                  start=mid+1;
              }else {
                  return mid;
              }
        }
        return -1;
    }
}
