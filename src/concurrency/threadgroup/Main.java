package concurrency.threadgroup;

public class Main {

    public static void main(String[] args) {
        System.out.println("System Threads.. ");
        Thread th = Thread.currentThread();
        ThreadGroup grp = th.getThreadGroup();
        while(grp.getParent()!=null){
//            System.out.println();
            grp=grp.getParent();
        }
        grp.list();
    }
}
