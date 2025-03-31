package Patterns;

public class numberPyramid {
    public static void main(String[] args) {
        for(int i = 1  ; i<= 5;i++){
            for(int j = 6;j>i;j--){
                System.out.print(" ");
            }for(int k = 1;k<=i;k++){
                System.out.print(" "+i);
            }
            System.out.println();
        }
    }
}
