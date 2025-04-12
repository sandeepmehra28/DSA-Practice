package BinarySearch.BinarySearchQuestions;

public class Find_the_Smallest_Divisor_Given_a_Threshold {
    public static void main(String[] args) {
        int[] arr = {1,2,5,9};
        int threshold = 6;
        int ans = smallestDivisor(arr,threshold);
        System.out.println(ans);
    }
    public static int smallestDivisor(int[] nums, int threshold) {
        int start = 1;
        int end = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>end){
                end = nums[i];
            }
        }
        int ans = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(isp(nums,mid,threshold)){
                ans  = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
    static boolean isp(int[] arr, int mid, int hold){
        int d = 0;
        for(int i = 0;i<arr.length;i++){
            d+=arr[i]/mid;
            if(arr[i]%mid!=0){
                d++;
            }
            if(d>hold){
                return false;
            }
        }
        return true;
    }
}
