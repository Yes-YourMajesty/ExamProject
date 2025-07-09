public class Wizard extends Character{
    int mp;
    public Wizard() {
        super();

    }
    public void setMp(int mp) {}

    public int getMp() {
        return this.mp;
    }

    @Override
    public void attack(Character target) {
        System.out.println(this.getName() + "は火の玉を放った！" + target.getName() + "に3のダメージを与えた！");
        target.setHp(target.getHp() - 6);
        this.setMp(this.getMp() - 1);
    }
}
