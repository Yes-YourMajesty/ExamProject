public abstract class Character implements Creature {
    String name;
    int hp;



    public Character(String name, int hp) {
        if (hp < 0) {
            throw new IllegalArgumentException("初期設定に誤りがあるため、キャラクターを作成できませんでした");
        }
        this.setName(name);
        this.setHp(hp);
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
            this.setHp(0);
        }
        this.hp = hp;
    }

    public final boolean isAlive(){
        return this.getHp() > 0;
    }

    public void showStatus() {
        System.out.println(this.getName() + ":HP " + this.getHp());
    }

}
