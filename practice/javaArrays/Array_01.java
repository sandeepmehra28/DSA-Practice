package javaArrays;

public class Array_01 {
    /*
    ->there are two type for declaring the array
    *first type
    -syntax  dataType[] variable = new dataType[size];
      int[] rollNum1 = new int[5];
    *second type
    -syntax dataType[] variable = {};
      int [] rollNum = {101,102,103,104};


    -> normal manner for print your array
         *using for loop to print array
            for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        *using for-each loop
         for (int i :object) {//for-each loop
            System.out.println(i);
        }
     */
    static void PrintArr(int[] object){
        System.out.println(" This is int Array:");
        //for-each loop
        for (int i :object) System.out.printf(" %d ",i);
    }
    static void PrintArr(String[] object){
        System.out.println(" This is String Array:");
        //for-each loop
        for (String i :object) System.out.printf(" %s ",i);
    }
    public static void main(String[] args) {

        int[] rollNum1 = {101,102,103,104,105};
        int [] rollNum2 = rollNum1;
        String[] name={"sachin","sonu","sandeep","chaman"};
        PrintArr(name);
        System.out.println();
        PrintArr(rollNum1);
        PrintArr(rollNum2);

    }
}
