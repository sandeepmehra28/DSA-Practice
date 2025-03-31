package BinarySearch.BinarySearchQuestions;

public class nextGreaterLetter {
    public static void main(String[] args) {
     char [] arr = {'a','b','c','d','e'};
     char target = 'c';
        System.out.println(greatestLetter(arr,target));
        int[] arr1 = {1,2,3,4,4,5,5,6,6,7,8};
        int target1 = 6;
        System.out.println(greaterElement(arr1,target1));
    }
    static char greatestLetter (char [] arr,char target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
                if(target<arr[mid]){
                    end  = mid-1;
                }else {
                    start = mid+1;
                }
        }
           return arr[start % arr.length];
    }
    static int greaterElement (int [] arr1,int target1){
        int start = 0;
        int end = arr1.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target1<arr1[mid]){
                end  = mid-1;
            }else {
                start = mid+1;
            }
        }
        return arr1[start % arr1.length];
    }
}
