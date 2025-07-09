public class Goblin extends Monster{

    @Override
    public void attack(Character target) {
        System.out.println(this.getName() + this.getSuffix() + "はナイフで切りつけた！" + target.getName() + "に8のダメージを与えた！");
        target.setHp(target.getHp() - 8);
    }
}
