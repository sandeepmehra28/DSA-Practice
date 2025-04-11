package BinarySearch.BinarySearchQuestions;

import java.util.Arrays;

public class Aggressive_Cows {
    public static void main(String[] args) {
        int [] arr = {1, 2, 4, 8, 9};
        int cows = 3;
        int ans = AgCow(arr,cows);
        System.out.println(ans);

    }
    static  int AgCow(int[] arr, int cows){
        Arrays.sort(arr);
        int start = 1;
        int n = arr.length;
        int end = arr[n-1]-arr[0];
        System.out.println(end);
        int ans = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            int count=1;
            int pos = arr[0];
            for(int i = 1;i<n;i++){
                if(pos+mid<=arr[i]){
                    count++;
                    pos=arr[i];
                }
            }
            if (count<cows){
                end = mid-1;
            }else {
                ans = mid;
                start = mid+1;
            }
        }
        return  ans;
    }

}
