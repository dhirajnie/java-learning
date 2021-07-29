package generics;

public class Test {

    public static void main(String da[]) {
        FootBallPlayer beckham = new FootBallPlayer("Bekham");
        BasketBallPlayer tom = new BasketBallPlayer("tom-basket");
        Team<FootBallPlayer> footBallTeam = new Team<>("FootBall Team");
        footBallTeam.addPlayerInTeam(beckham);
        footBallTeam.printPlayer();

/* This will not allow to add the basket ball player here
footBallTeam.addPlayerInTeam(tom);
 */

        /*
        Generic with extends to prevent the type
        <T extends Player>
          Team<String> basketBallTeam = new Team<>("FootBall Team");
            basketBallTeam.addPlayerInTeam("abds");
         */




    }
}
