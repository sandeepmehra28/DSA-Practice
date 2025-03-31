package javaMethod;
import java.util.Arrays;


public class methodOverloading {
   static void demo (int ...d){
        System.out.println(Arrays.toString(d));
    }
    static void demo(String ...d){
        System.out.println(Arrays.toString(d));
    }
    static void demo(float ...d){
        System.out.println(Arrays.toString(d));
    }
    static void demo(String s,int ...d){
        System.out.println(Arrays.toString(d));
        System.out.println(s);
    }
//    static void demo(){
//        System.out.println("hello");
//    }

    public static void main(String[] args) {
          demo(1,2,3,4,5);
    }

}
