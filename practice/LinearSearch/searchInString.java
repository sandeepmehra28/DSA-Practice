package LinearSearch;

public class searchInString {
    public static void main(String[] args) {
        String name = "Sandeep";
        char find ='e';
        boolean out = stringSearch(name,find);
        int out1 = stringSearch2(name,find);
        System.out.printf(" will be given true or false:%s\n" +
                "will be given index to find:%d",out,out1);
    }
    static boolean stringSearch(String name, char target){
        for (int index = 0; index < name.length(); index++) {
            if(name.charAt(index)==target){
                return true;
            }
        }
        return false;
    }
    static int stringSearch2(String name, char target){
        for (int index = 0; index < name.length(); index++) {
            if(name.charAt(index)==target){
                return index;
            }
        }
        return Integer.MAX_VALUE;
    }
}
