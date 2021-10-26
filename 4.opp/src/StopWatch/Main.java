package StopWatch;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch1 = new StopWatch();

long total = 0;
        stopWatch1.start();
        for (long i = 0; i < 100000; i++) {
           total += i;
            System.out.println(total);
        }
        stopWatch1.stop();
        System.out.println(stopWatch1.getElapsedTime()+"ms");
    }
}
