package javaArrays;
import java.util.Arrays;
public class Array_04_PassingFun {

    public static void main(String[] args) {
      int[] nums ={1,2,3,4,5};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] nums){
       nums[1]=99;
       nums[3]=55;
    }
}
