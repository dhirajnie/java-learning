package generics;

import java.util.ArrayList;
import java.util.List;

/*
public class Team<Player> {

    /* if we use this way any Player can be added in any team.
     Suppose we want to add the type safetly e.g. only football player in the team ;
     we will use generics for this
     */
/*
    List<Player> members=new ArrayList<>();

}

 */
public class Team<T extends Player> {
    final String teamName;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    private List<T> members = new ArrayList<>();

    void addPlayerInTeam(T player) {
        members.add(player);
    }

    void printPlayer() {
        for (int i = 0; i < members.size(); i++) {
            System.out.println(((Player) members.get(i)).name);
        }
    }
}
