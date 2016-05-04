package java8.lambdaexpression;

/**
 * Created by Arc on 4/5/2016.
 */
public class TestThread {

    public static void main(String args[]) throws Exception {
        //Before Java 8:
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Before Java8 ");
            }
        }).start();

        //Java 8 way:
        new Thread( () -> System.out.println("In Java8!") ).start();
        Thread.sleep(1000L);
    }

}
