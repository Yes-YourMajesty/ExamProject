import java.util.ArrayList;

public abstract class Character implements Creature {
    String name;
    int hp;
    boolean alive;



    public String getName() {
        return this.name;
    }

    public final boolean isAlive() {
        return this.getHp() > 0;
    }

    public void showStatus() {
        System.out.println(this.getName() + ":HP " + this.getHp());
    }

}
