package BinarySearch.BinarySearchQuestions;

import java.util.Arrays;

public class medianArr {
    public static void main(String[] args) {  
        int [] arr1 = {1,4,2,3};
        int [] arr2 = {5,7,9,8,6};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        double ans = findMedianSortedArrays(arr1,arr2);
        System.out.println(ans);
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
         // make num1 as min length array.
        // call same function, and change the params
        // if nums1 was greater and nums2 was smaller
        // so because we swapped these two, now nums1 is smaller and
        // nums2 is greater.
        if(nums1.length > nums2.length){
            return findMedianSortedArrays(nums2,nums1);
        }
        // nums1 is smaller and num2 is greater.
        int n1 = nums1.length;
        int n2 = nums2.length;
        int N = n1+n2;
        int start = 0;
        int end = n1;
        while (start<=end){
            int mid1 = start + (end - start)/2;
            int mid2 = N/2 - mid1;
            int l1 = (mid1==0)?Integer.MIN_VALUE:nums1[mid1-1];
            int l2 = (mid2==0)?Integer.MIN_VALUE:nums2[mid2-1];
            int r1 = (mid1==n1)?Integer.MAX_VALUE:nums1[mid1];
            int r2 = (mid2==n2)?Integer.MAX_VALUE:nums2[mid2];
            // check if cut is valid
            if(l1 <= r2 && l2 <= r1){
                if(N%2!=0){
                    return (double) Math.min(r1,r2);
                }
                else {
                    return ((Math.max(l1,l2) + Math.min(r1,r2))/2.0);
                }
            } else if (l1>r2) {
                end = mid1-1;
            } else{
                start = mid1+1;
            }
        }
    return 0.0; // to avoid error
    }
}
