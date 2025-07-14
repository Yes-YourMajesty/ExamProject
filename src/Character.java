public abstract class Character implements Creature {
    String name;
    int hp;
    boolean alive;



    public String getName() {
        return this.name;
    }

    public void setName(String name) {// 妥当性チェック
        if (name == null) {
            throw new IllegalArgumentException("名前がnullである。処理を中断。");
        }
        this.name = name;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public final boolean isAlive(){
        return this.getHp() > 0;
    }

    public void showStatus() {
        System.out.println(this.getName() + ":HP " + this.getHp());
    }

}
