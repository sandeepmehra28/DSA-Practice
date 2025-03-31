package LinearSearch;

public class MinValueSearch {
    public static void main(String[] args) {
     int[] arr ={22,44,66,1,88};
        System.out.println(minVal(arr));
        System.out.println(maxVal(arr));
    }
    //searching minimum value in the array
    static int minVal(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
        // and you also use for-each loop
//        for(int i:arr){
//            if(i<min){
//                min=arr[i];
//            }
//        }
//        return min;
//        }
    }
    //

    //searching maximum value in the array
    static int maxVal(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;

    }
}
