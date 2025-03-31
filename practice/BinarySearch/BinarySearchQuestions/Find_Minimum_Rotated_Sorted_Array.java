package BinarySearch.BinarySearchQuestions;

public class Find_Minimum_Rotated_Sorted_Array {
    public static void main(String[] args) {
    int [] arr = {4,5,6,7,8,9,1,2,3};
    int ans = findMin(arr);
        System.out.println(ans);
    }
    static int findMin(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int min = Integer.MAX_VALUE;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(arr[start]<=arr[mid]){
                min = Math.min(min,arr[start]);
                start = mid+1;
            }else{
                min = Math.min(min,arr[mid]);
                    end = mid-1;
            }
        }
        return min;
    }
}
