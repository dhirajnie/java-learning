package lamda;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    String name;
    String id;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}

public class Lamb {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("new Thread " + Thread.currentThread())).start();

        List<Person> perList = new ArrayList<>();
        Collections.sort(perList, Comparator.comparing(Person::getId).reversed());




    }
}
