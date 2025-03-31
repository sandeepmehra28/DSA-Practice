package Lecture_1;
class tClass extends Thread{
    private final char Ch;
    public tClass(char Ch) {
        this.Ch = Ch;
    }
    @Override
    public void run() {
       try{
           for (int i = 1; i < 1000; i++) {
               System.out.print(Ch+" ");
           }sleep(2250);
       }catch (InterruptedException Ie){
           System.out.println(Ie.getMessage());
       }
    }
}
public class threadClass {
    public static void main(String[] args) {
        long startingPoint = System.currentTimeMillis();
        tClass tc1 = new tClass('@');
        tClass tc2 = new tClass('#');
        tClass tc3 = new tClass('$');
        try{
            tc1.setPriority(Thread.MIN_PRIORITY);
            tc1.join();
            tc1.start();
            tc2.setPriority(Thread.NORM_PRIORITY);
            tc2.join();
            tc2.start();
            tc3.setPriority(Thread.MAX_PRIORITY);
            tc3.join();
            tc3.start();
        }catch (InterruptedException Ie){
            System.out.println(Ie.getMessage());
        }
        long endingPoint = System.currentTimeMillis();
        System.out.printf("total time for executing : %d Milisec ",endingPoint-startingPoint);
    }

}
