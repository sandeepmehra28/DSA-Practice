package Patterns;

public class halfPyramid {
    public static void main(String[] args) {
        int r =4;
        int c=5;
        for(int  i =1 ;i<=r;i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
