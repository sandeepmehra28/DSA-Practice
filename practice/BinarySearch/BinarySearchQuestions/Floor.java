package BinarySearch.BinarySearchQuestions;
// if target number doesn't exist this method return the smallest index <= target
// this method performing only sorted des order array
//second name is: Insert Position in Sorted Array
public class Floor {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,11,22,33,44,55,66,77,88,99};
        int target  = 3;
        int ans = bs(arr,target);
        System.out.println(ans);
    }
    static int bs (int [] arr,int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start]<=arr[end];
        while(start<=end){
            int mid = start+(end-start)/2;
            if(isAsc){
                if(target<arr[mid]){
                    end  = mid-1;
                }else {
                    start = mid+1;
                }
            }else {
                if(target>arr[mid]){
                    end  = mid-1;
                }else {
                    start = mid+1;
                }
            }
        }

        return end;
    }
}
