package javaArrays;

public class findMaxInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(maxRange(arr,4,8));

    }
    static int maxRange(int [] arr,int star,int end){
        int max = arr[star];
        for (int i = star; i <= end; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }return max;
    }
}
