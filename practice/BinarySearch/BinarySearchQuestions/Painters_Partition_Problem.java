package BinarySearch.BinarySearchQuestions;

import java.util.ArrayList;

public class Painters_Partition_Problem {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        //2, 1, 5, 6, 2, 3
        arr.add(48);
        arr.add(90);
        int n = arr.size();
        int sum = 0;
        int maxLength = 0;
        for(int i = 0;i<n;i++){
            sum += arr.get(i);
            maxLength = Math.max(maxLength, arr.get(i));
        }
        int time = 2;
        int ans = painter_Partition(arr,time,maxLength,sum);
        System.out.println(ans);
    }
    static  int painter_Partition(ArrayList<Integer> arr,int time,int start, int end){
        int ans=-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(isPossible(arr,mid,time)){
                ans = mid;
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return ans;
    }
    static boolean isPossible(ArrayList<Integer> arr, int mid, int time){
        int current = 1;
        int wall = 0;
        for(int i=0;i<arr.size();i++){
            wall+=arr.get(i);
            if(wall>mid){
                current++;
                wall=arr.get(i);
            }if(current>time){
                return false;
            }
        }
        return true;
    }
}
