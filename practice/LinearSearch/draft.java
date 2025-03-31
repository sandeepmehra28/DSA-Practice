package LinearSearch;

public class draft {
    public static void main(String[] args) {
        int[] arr = {22,345672,1,222,3343};
        System.out.println(findEven(arr));
    }

    static int findEven(int [] arr){
        int count = 0;
        for(int i : arr){
            if (Even(i)){
                  count++;
            }
        }return count;
    }
    static boolean Even(int num) {
       int numberOfDigits = digits(num);
        //  if(numberOfDigits%2==0){
        //      return true;
        //  }
        // return false;
        return numberOfDigits % 2==0;
    }
    static int digits(int num){
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }return count;
    }
}

