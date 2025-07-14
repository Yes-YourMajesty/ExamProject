public class Hero extends Character{
    String weapon;

    String getWeapon(){
        return weapon;
    }

    void setWeapon(String weapon){
        this.weapon = weapon;
    }

    Hero(String name,int hp,String weapon){
        this.setName(name);
        this.setHp(hp);
        this.setWeapon(weapon);
    }

    @Override
    public void attack(Creature target) {
        System.out.println(this.getName() + "は" + this.weapon + "で攻撃！" + target.getName() + "に10のダメージを与えた！");
        target.setHp(target.getHp() - 10);
    }

}
