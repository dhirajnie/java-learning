package concurrency.threeThreadAlternate;


class Printer{
    int expectedInt=0;
    synchronized void  print(int i ) throws InterruptedException {

         while(expectedInt!=i){
             wait();
         }
        System.out.println(Thread.currentThread().getName()+" ->"+i);
         ++expectedInt;
         notifyAll();
     }
}

class First extends Thread{
    Printer printer;

    public First(Printer printer) {
        this.printer = printer;
    }

    public void run(){
        for(int i =0;i<100;i=i+3){
            try {
                printer.print(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SecondThread extends Thread
{
    Printer printer;

    public SecondThread(Printer printer) {
        this.printer = printer;
    }

    public void run(){
        for(int i =1;i<100;i=i+3){
            try {
                printer.print(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Third extends Thread{
    Printer printer;

    public Third(Printer printer) {
        this.printer = printer;
    }

    public void run(){
        for(int i =2;i<100;i=i+3){
            try {
                printer.print(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class AlernateThread {

    public static void main(String[] args) {

        Printer p =new Printer();
        First f = new First(p);
        SecondThread s = new SecondThread(p);
        Third t = new Third(p);
        f.start();
        s.start();
        t.start();

    }

}
