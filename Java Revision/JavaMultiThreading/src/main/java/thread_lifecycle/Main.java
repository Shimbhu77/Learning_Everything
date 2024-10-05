package thread_lifecycle;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        ThreadLife threadLife = new ThreadLife();

        System.out.println("Thread State : "+threadLife.getState());

        threadLife.start();

        System.out.println("Thread State : "+threadLife.getState());

        Thread.sleep(1000);

        System.out.println("Thread State : "+threadLife.getState());

        threadLife.join();

        System.out.println("Thread State : "+threadLife.getState());

    }
}
