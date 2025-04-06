package BinarySearch.BinarySearchQuestions;

public class Capacity_To_Ship_Packages_Within_D_Days {
    public static void main(String[] args) {
        int [] weights  = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        int totalWeights = 0;
        for(int n: weights){
            totalWeights+=n;
        }
        int largestWeights = Integer.MIN_VALUE;
        for(int n:weights){
            if(n>largestWeights){
                largestWeights=n;
            }
        }
        int ans = allOf(weights,days,largestWeights,totalWeights);
        System.out.println(ans);
    }
   public static int allOf(int[] arr, int days, int start, int end){
        int ans = -1;
        if(arr.length<days){
            return ans;
        }
        while(start<=end){
            int mid = start+(end-start)/2;
            if(isP(arr,mid,days)){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
    static boolean isP(int [] arr,int mid, int days){
        int currentDay = 1;
        int part = 0;
        for(int i = 0;i<arr.length;i++){
            part+=arr[i];
            if(part>mid){
                currentDay++;
                part=arr[i];
            }if(currentDay>days){
                return false;
            }
        }
        return true;
    }
}

