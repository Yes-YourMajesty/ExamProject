public class Wizard extends Character{
    int mp;


    int getMp() {
        return this.mp;
    }

    void setMp(int mp) {
        this.mp = mp;
    }
    Wizard(String name,int hp,int mp){
        this.setName(name);
        this.setHp(hp);
        this.setMp(mp);
    }

    @Override
    public void attack(Creature target) {
        System.out.println(this.getName() + "は火の玉を放った！" + target.getName() + "に3のダメージを与えた！");
        target.setHp(target.getHp() - 3);
        this.setMp(this.getMp() - 1);
    }
}
