package utilityClass;

public class Prime {
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        int count = 2;
        while(count*count<=num){
            if (num%count==0){
                return false;
            }
            count++;
        }
        if(count*count>num){
            return true;
        }
        return false;
    }

}
