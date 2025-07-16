public abstract class Monster implements Creature{
    String name;
    int hp;
    char suffix;
    boolean alive;



    public Monster(String name, int hp, char suffix) {
        if (hp < 0) {
            throw new IllegalArgumentException("初期設定に誤りがあるため、キャラクターを作成できませんでした");
        }
        this.setName(name);
        this.setHp(hp);
        this.setSuffix(suffix);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
        hp = 0;
        }
        this.hp = hp;
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
        System.out.println(this.getName() + this.getSuffix() + ":HP " + this.getHp());
    }
}
