package concurrency.producerconsumer;

import java.util.Random;

public class Main {

    public static void main(String dsap[]) {
        Message msg = new Message();
        Thread reader = new Thread(new Reader(msg));
        reader.start();
        Thread writer = new Thread(new Writer(msg));
        writer.start();
    }
}

class Writer implements Runnable {
    Message message;

    Writer(Message msg) {
        this.message = msg;
    }

    @Override
    public void run() {
        String msg[] = {"Humpy", "Dumpy", "on the ", "wall"};
        for (String str : msg) {
            message.write(str);
        }
        Random random = new Random();
        try {
            Thread.sleep(random.nextInt(300));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        message.write("Finished");
    }

}

class Reader implements Runnable {
    Message message;

    Reader(Message msg) {
        this.message = msg;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            String msg = message.read();
            System.out.println(msg);
            if (msg!=null && msg.equals("Finished")) {
                break;
            }
            try {
                Thread.sleep(random.nextInt(300));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class Message {

    private String message;
    private boolean isEmpty;

    public synchronized String read() {
        /*
        We always call wait() inside a loop because it depends on the underlying OS
        wheather the value of isEmpty changed by some other thread means it is not guranteed that
        after reader start calling wait and in the writer is scheduled and written something
         */
        while (isEmpty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isEmpty = true;
        notifyAll();
        return message;
    }

    public  synchronized void write(String message) {
        while (!isEmpty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isEmpty = false;
        this.message = message;
        notifyAll();
    }
}
