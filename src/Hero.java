public class Hero extends Character{
    String weapon;

    public Hero(){

    }

    @Override
    public void attack(Character target) {
        System.out.println(this.getName() + "は" + this.weapon + "で攻撃！" + target.getName() + "に10のダメージを与えた！");
        target.setHp(target.getHp() - 10);
    }

}
