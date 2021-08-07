package lamda;



public class Greeter {

    public void greet(Greeting greeting){
        greeting.perform();
    }


    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        greeter.greet(new HelloWorldGreeting());
        /**
         * This matches the argument and return type with the method specified in the interface
         * In a way Lamda expression behaving as implementation of any interface which has only one method
         *
         */
        Greeting grtLamb = ()-> System.out.println("Hello World greet lambda");
        greeter.greet(grtLamb);

        grtLamb.perform();

        /**
         * Below piece of code is replaced with lamda.
         * This is called anynomous class
         */
        Greeting greeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("This is called anynomous class");
            }
        };
        greeting.perform();

    }

}
