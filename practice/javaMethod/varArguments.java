package javaMethod;

import java.util.Arrays;

public class varArguments {
    public static void main(String[] args) {
     fun(1,2,3,4,5,6);
     fun2("sachin","sonu","chaman","sandeep");
    }
    static void fun2(String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun (int ...v){
        System.out.println(Arrays.toString(v));
    }
}
