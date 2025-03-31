package bitManipulation;

public class leftShift {
    public static void main(String[] args) {
        int n =5;//0101
        int pos = 3;
        int bitMask = n<<pos;
        if((bitMask&n)==0){
            System.out.println("bit was zero");
        }else {
            System.out.println("bit was one");
        }
    }
}
