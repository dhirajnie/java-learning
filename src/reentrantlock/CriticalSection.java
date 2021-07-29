package reentrantlock;

import java.util.ArrayList;
import java.util.List;

public class CriticalSection {
    List<Integer> list;

    CriticalSection() {
        list = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
    }

    void printCounting() {
        /**
         * In multi thread env this part dont print in order
         *

         */
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
