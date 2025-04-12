package BinarySearch.BinarySearchQuestions;

import java.util.Arrays;

public class Koko_Eating_Bananas {
    public static void main(String[] args) {
        int[] arr ={1,4,3,2};
        int hour = 9;
        int ans = minEatingSpeed(arr,hour);
        System.out.println(ans);
    }
    public static int minEatingSpeed(int[] arr, int hour) {
        int start = 1;
        int end = Integer.MIN_VALUE;
        int ans = -1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>end){
                end = arr[i];
            }
        }
        while(start<=end){
            int mid = start+(end-start)/2;
            if(isP(arr,mid,hour)){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
  static   boolean isP(int[] arr, int speed, int hour){
      int time = 0;
      for(int i = 0;i<arr.length;i++){
          time += arr[i]/speed;
          if(arr[i]%speed!=0){
              time++;
          }if(time>hour){
              return false;
          }
      }
      return true;
    }
}
//public int minEatingSpeed(int[] arr, int hour) {
//    int start = 1;
//    int end = Integer.MIN_VALUE;
//    int ans = -1;
//    for(int i = 0;i<arr.length;i++){
//        if(arr[i]>end){
//            end = arr[i];
//        }
//    }
//    while(start<=end){
//        int mid = start+(end-start)/2;
//        if(isP(arr,mid,hour)){
//            ans = mid;
//            end = mid-1;
//        }else{
//            start = mid+1;
//        }
//    }
//    return ans;
//}
//boolean isP(int[] arr, int speed, int hour){
//    int time = 0;
//    for(int i = 0;i<arr.length;i++){
//        time += arr[i]/speed;
//        if(arr[i]%speed!=0){
//            time++;
//        }if(time>hour){
//            return false;
//        }
//    }
//    return true;
//}