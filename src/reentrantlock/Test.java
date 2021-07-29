package reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class Test {

    public static void main(String[] args) {
        CriticalSection ct = new CriticalSection();
        ReentrantLock rt = new ReentrantLock();
        Thread1 t1 = new Thread1(ct,rt);
        Thread2 t2 = new Thread2(ct,rt);
        t1.start();
        t2.start();

    }
}
