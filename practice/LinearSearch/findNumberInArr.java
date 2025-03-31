package LinearSearch;
public class findNumberInArr {
    public static void main(String[] args) {
  int[] arr = {22,45,6,7,8,9,8,21};
  int element = 6;
  //calling the function
  int out = LinearSearch(arr,element);
        System.out.println("index is:"+out);
        int out2 = LinearSearch2(arr,element);
        System.out.println("Element value is:"+out2);
    }
    //linearsearch using for return the element
    static int LinearSearch2(int[] arr,int target){
        //out of the length
        if(arr.length==0){
            return -1;
        }
        //searching your targeted value in the array
        //if they found they return index value
        //otherwise return -1
        for (int element : arr) {
            if (element == target) {
                return element;

            }
        }
        return Integer.MAX_VALUE;

    }
    static int LinearSearch(int[] arr,int target){
        //out of the length
        if(arr.length==0){
            return -1;
        }
        //searching your targeted value in the array
        //if they found they return index value
        //otherwise return -1
        for (int index = 0; index < arr.length ; index++) {
            int element = arr[index];
            if(element==target){
                return index;

            }
        }  return Integer.MAX_VALUE;

    }
}
