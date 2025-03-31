package LinearSearch;

public class searchInRange {
    public static void main(String[] args) {
        int [] arr = {22,55,66,77,88,99,33};
        int target = 88;
        int output = LinearSearch(arr,target,2,4);
        System.out.println(output);
    }
    static int LinearSearch(int [] arr,int target,int start ,int end){
        if(arr.length==0){
            return -1;
        }
        for (int i = start; i <= end; i++) {
             int element = arr[i];
             if(element==target){
                 return i;
             }
        }
        return -1;
    }
}
