package runnable;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = new RunnableClass();

        Thread thread = new Thread(runnable);

        System.out.println("Starting the main thread");

        thread.start();

        System.out.println("Ending the main thread");

        // using lambda

        Runnable runnableLambda = () -> {
            for(int i=1;i<=10;i++)
            {
                System.out.println("number : "+i);
            }
        };

        Thread lambdaThread = new Thread(runnableLambda);
        System.out.println("starting lambda thread");
        lambdaThread.start();
        System.out.println("ending lambda thread");
    }
}
