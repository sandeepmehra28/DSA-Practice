package strings;

public class compairString {
    public static void main(String[] args) {
//        String name1 = "sandeep";
//        String name2 = "sandeep";
        if(new String("sandeep").compareTo(new String("sandeep"))==0){
            System.out.println("both Strings are equal");
        }else {
            System.out.println("both Strings are not equal");
        }
        //convert the  integer into String using toString method;

        int number = 123;
        String str = Integer.toString(number);
        System.out.println(str);
    }
}
