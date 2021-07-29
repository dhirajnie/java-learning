package semaphore;

public class Test {


    public static void main(String ds[]) {
        SharePrinter sharePrinter = new SharePrinter();
        EvenThread eventT= new EvenThread(sharePrinter);
        OddThread oddT = new OddThread(sharePrinter);
        eventT.start();
        oddT.start();

    }
}
