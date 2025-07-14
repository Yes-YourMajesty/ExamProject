public class SuperHero extends Hero {

    public SuperHero(Hero hero) {
        super(hero.getName(), hero.getHp(), hero.getWeapon());
        System.out.println("勇者はスーパーヒーローに進化した！");
    }

    @Override
    public void attack(Creature target) {
        System.out.println(this.getName() + "は" + this.weapon + "で攻撃！" + target.getName() + "に25のダメージを与えた！");
        target.setHp(target.getHp() - 25);
    }

}
