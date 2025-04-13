package BinarySearch.BinarySearchQuestions;

public class Aggressive_Cows2 {
    public static void main(String[] args) {
        int [] stalls = {2,4,8,11,13,15};
        int cows = 3;
        int ans = AgCow(stalls,cows);
        System.out.println(ans);
    }
    static  int AgCow(int [] stalls, int cows){
        int start = 1;
        int end= stalls[stalls.length-1]-stalls[0];
        int ans  = -1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(isp(stalls,mid,cows)){
                ans = mid;
                start = mid+1;
            }else{
                end= mid-1;
            }
        }
        return ans;
    }
    static  boolean isp(int[] arr, int mid, int cow){
        int co =1;
        int po=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]-po>=mid){
                co++;
                po = arr[i];
            }if(co>=cow){
                return true;
            }
        }
        return false;
    }
}
