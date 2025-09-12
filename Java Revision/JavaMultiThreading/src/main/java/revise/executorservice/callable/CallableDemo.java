package revise.executorservice.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<Integer> callable = () ->{
            Thread.sleep(4000);
            return 7;
        };

        System.out.println("hii");

        Future<Integer> future = executorService.submit(callable);

        System.out.println(future.get());

        System.out.println("hello");

        executorService.shutdown();
    }
}
