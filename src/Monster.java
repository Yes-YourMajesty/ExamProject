public abstract class Monster implements Creature{
    String name;
    int hp;
    char suffix;
    boolean alive;



    public String getName() {
        return this.name;
    }

    public void setName(String name) {// 妥当性チェック
        if (name == null) {
            throw new IllegalArgumentException("名前がnullである。処理を中断。");
        }
        if (name.length() <= 1) {
            throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
        }
        if (name.length() >= 8) {
            throw new IllegalArgumentException("名前が長すぎる。処理を中断。");
        }
        this.name = name;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
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
