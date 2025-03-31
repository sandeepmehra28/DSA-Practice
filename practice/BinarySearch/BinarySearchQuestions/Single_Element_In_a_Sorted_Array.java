package BinarySearch.BinarySearchQuestions;

public class Single_Element_In_a_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6, 7, 7};
        System.out.println(find(arr));
    }
    static int find(int[] arr){
        int start = 0;
        int end =arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(mid%2==1){
                mid--;
            }
            if(arr[mid]==arr[mid+1]){
                start = mid+2;
            }else{
                end = mid;
            }
        }
         return arr[start];
    }
}
