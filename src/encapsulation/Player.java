package encapsulation;

public class Player {
    /**
     * Member variable are private as we are not exposing to change
     * from the outside world. and only allowing changes
     * from the public member varibale, in this way we
     * can add more validation in the code
     */
    private String name;
    private int health;
    private String weapon;

    public Player(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 1000) {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void looseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health < 0) {
            System.out.println("Player knocked out");
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
