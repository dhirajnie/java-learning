package generics;

public class FootBallPlayer extends Player {

    public FootBallPlayer(String name) {
        super(name);
    }

    @Override
    void play() {
        System.out.println("Football player playing");
    }
}
