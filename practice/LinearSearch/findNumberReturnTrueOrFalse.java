package LinearSearch;

public class findNumberReturnTrueOrFalse {
    public static void main(String[] args) {
        int[] arr = {22,45,6,7,8,9,8,21};
        int element = 6;
        //calling the function
        boolean out = LinearSearch(arr,element);
        System.out.println(out);
    }
    static boolean LinearSearch(int[] arr,int target){
        //out of the length
        if(arr.length==0){
            return false;
        }
        //searching your targeted value in the array
        //if they found they return index value
        //otherwise return -1
        for (int index = 0; index < arr.length ; index++) {
            int element = arr[index];
            if(element==target){
                return true;

            }
        }  return false;

    }
}
