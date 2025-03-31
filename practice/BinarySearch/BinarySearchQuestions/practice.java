package BinarySearch.BinarySearchQuestions;
// this file only use for previous question practice 
public class practice {
    public static void main(String[] args) {
        System.out.println("this is my practice file");
    }
    static  int find(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAs = arr[start]<=arr[end];
        while(start<=end){
            int mid  = start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
        }   
            //if condition is true
            if(isAs){
                if(target<arr[mid]){
                    end =mid-1;
                 }else{
                    start = mid+1;
                }
                }else{
                if(target>arr[mid]){
                   start = mid+1;
                }else{
                    end= mid-1; 
                }
            }
        }
        return -1;
    }
}
