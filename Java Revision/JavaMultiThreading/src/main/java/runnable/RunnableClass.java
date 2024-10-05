package runnable;

public class RunnableClass implements Runnable {
    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        for(int i=20;i<30;i++)
        {
            System.out.println("Running the thread using Runnable Interface : i : "+i+" "+Thread.currentThread().getName());
        }
    }
}
