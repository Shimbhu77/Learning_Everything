package runnable;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = new RunnableClass();

        Thread thread = new Thread(runnable);

        System.out.println("Starting the main thread");

        thread.start();

        System.out.println("Ending the main thread");
    }
}
