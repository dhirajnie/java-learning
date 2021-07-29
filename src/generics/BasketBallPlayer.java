package generics;

public class BasketBallPlayer extends Player{
    public BasketBallPlayer(String name) {
        super(name);
    }

    @Override
    void play() {
        System.out.println("Basket ball Player playing ");
    }
}
