package executorservice;

import java.util.concurrent.*;


class Task implements Runnable {
    String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Running Task " + this.taskName);
    }
}

class CallableTask implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("Callable method called ");
        Thread.sleep(1000);
        return 1;
    }
}

public class ExecutorTest {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService ex = Executors.newFixedThreadPool(2);
        ex.execute(new Task("A"));
        ex.execute(new Task("B"));
        ex.execute(new Task("C"));
        ex.execute(new Task("D"));


        /**
         * THere is a different way to submit callable task in executor service
         */
        Future<Integer> x = ex.submit(new CallableTask());
        /**
         * THis part of the program just check if it is done and if not done it
         * will move to next execution statement
         */
        if (x.isDone()) {
            System.out.println(x.get());
        }
        /**
         * Directly calling .get() method block the execution of the problem and
         * wait until its dont get resolved
         */
        System.out.println(x.get());
        ex.shutdown();
    }


}
