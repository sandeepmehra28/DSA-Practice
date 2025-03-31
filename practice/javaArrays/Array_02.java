package javaArrays;
// default values for arrays
// when we're declaring empty array and print the array
// so they're showing the by default values
public class Array_02 {
    public static void main(String[] args) {
      int[] arr=new int[5];
        System.out.println(arr[0]);
        //output: by default value is 0

        String [] arrs = new String[5];
        System.out.println(arrs[0]);
        //output: by default value is null

        double[] db = new double[5];
        System.out.println(db[0]);
        //output: by default value is 0.0
    }
}
