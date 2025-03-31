package BinarySearch.BinarySearchQuestions;

public class Find_Element_Infinite_Array {
    public static void main(String[] args) {
     int[] arr = {1,2,3,4,5,6,7,8,9,11,22,33,44,55,66,77,88};
     int target = 55;
     int[] range = findRangeInInfiniteArray(arr,target);
     int ans = binarySearch(arr,target,range[0],range[1]);
        System.out.println(ans);
    }
    static int[] findRangeInInfiniteArray(int arr[], int target){
        int range[] = new int[2];

        int start = 0;
        int end = 1;

        while(arr[end]<target){
            start = end;
            end = 2*end;
        }
        range[0] = start;
        range[1] = end;

        return range;
    }
    static int binarySearch(int [] arr,int target, int start, int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target == arr[mid]){
                return mid;
            } else if (target<=arr[mid]) {
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return -1;
    }
}
