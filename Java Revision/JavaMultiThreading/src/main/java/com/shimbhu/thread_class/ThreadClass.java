package com.shimbhu.thread_class;

public class ThreadClass extends Thread{
    /**
     * This method is run by the thread when it executes. Subclasses of {@code
     * Thread} may override this method.
     *
     * <p> This method is not intended to be invoked directly. If this thread is a
     * platform thread created with a {@link Runnable} task then invoking this method
     * will invoke the task's {@code run} method. If this thread is a virtual thread
     * then invoking this method directly does nothing.
     *
     * @implSpec The default implementation executes the {@link Runnable} task that
     * the {@code Thread} was created with. If the thread was created without a task
     * then this method does nothing.
     */
    @Override
    public void run() {
        for(int i=0;i<10;i++)
        {
            System.out.println("Running thread : i : "+i + " Thread name : "+Thread.currentThread().getName());
        }
    }
}
