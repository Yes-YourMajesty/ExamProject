public abstract class Monster implements Creature{
    String name;
    int hp;
    char suffix;
    boolean alive;



    public String getName() {
        return this.name;
    }

    public void setSuffix(char suffix) {
        this.suffix = suffix;
    }

    public char getSuffix(){
        return this.suffix;
    }

    public final boolean isAlive() {
        return this.getHp() > 0;
    }

    public void showStatus() {
        System.out.println(this.getName() + this.suffix + ":HP " + this.getHp());
    }
}
