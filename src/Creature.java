public interface Creature {

    boolean isAlive();

    void showStatus();

    void attack(Character target);

    String getName();

    int getHp();

    void setHp(int hp);

}