public class Goblin extends Monster{

    Goblin(char suffix,int hp,String name){
        super(name, hp, suffix);
        this.setName(name);
    }

    @Override
    public void attack(Creature target) {
        System.out.println(this.getName() + this.getSuffix() + "はナイフで切りつけた！" + target.getName() + "に8のダメージを与えた！");
        target.setHp(target.getHp() - 8);
    }
}
