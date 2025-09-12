package revise.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 10; i++) {
            int finalI = i;

            executorService.submit(() -> {
                System.out.println(factorial(finalI));
            });
        }

        executorService.shutdown();
    }

    public static long factorial(int num) {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        return fact;
    }
}
