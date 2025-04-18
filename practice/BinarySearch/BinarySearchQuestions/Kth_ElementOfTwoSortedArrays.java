package BinarySearch.BinarySearchQuestions;

public class Kth_ElementOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 ={2, 3, 45};
        int [] arr2 ={4, 6, 7, 8};
        int k =4;
        System.out.println(kthElement(arr1,arr2,k));
    }
    static int kthElement(int[] arr1, int[] arr2, int k){
        if(arr1.length>arr2.length){
            return kthElement(arr2,arr1,k);
        }
        int n1= arr1.length;
        int n2 =arr2.length;
        int start = Math.max(0,k-n2);
        int end = Math.min(k,n1);
        while(start<=end){
            int mid1 = start+(end-start)/2;
            int mid2 = k-mid1;
            int l1 = (mid1==0)?Integer.MIN_VALUE:arr1[mid1-1];
            int l2 = (mid2==0)?Integer.MIN_VALUE:arr2[mid2-1];
            int r1 = (mid1==n1)?Integer.MAX_VALUE:arr1[mid1];
            int r2 =(mid2==n2)?Integer.MAX_VALUE:arr2[mid2];
            if(l1<=r2&&l2<=r1){
                return Math.max(l1,l2);
            }else if(l1>r2){
                end=mid1-11;
            }else{
                start=mid1+1;
            }
        }
        return 0;
    }
    
}
