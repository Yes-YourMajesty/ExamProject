public class SuperHero extends Hero {

    public SuperHero(Hero hero) {
        super(hero.name, hero.hp, hero.weapon);
    }

    @Override
    public void attack(Character target) {
        System.out.println(this.getName() + "は" + this.weapon + "で攻撃！" + target.getName() + "に25のダメージを与えた！");
        target.setHp(target.getHp() - 25);
    }

}
