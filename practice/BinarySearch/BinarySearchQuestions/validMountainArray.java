package BinarySearch.BinarySearchQuestions;

public class validMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 9, 6, 4, 2};
        boolean ans = checkValidMountainArray(arr);
        System.out.println(ans);

    }
    static boolean checkValidMountainArray(int [] arr){
        int index = 0;
        int n = arr.length;
        while(index<n-1){
            if(arr[index]<arr[index+1]){
                index++;
            }else{
                break;
            }
        }
        if(index==0||index==n-1){
            return false;
        }
        while(index<n-1){
            if(arr[index]>arr[index+1]){
                index++;
            }else{
                break;
            }
        }
        return (index==n-1);
    }
    }


