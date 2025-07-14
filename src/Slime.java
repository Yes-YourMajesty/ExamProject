public final class Slime extends  Monster{

    Slime(char suffix,int hp,String name){
        this.setSuffix(suffix);
        this.setHp(hp);
        this.setName(name);
    }

    @Override
    public void attack(Creature target) {
        System.out.println(this.getName() + this.getSuffix() + "は体当たり攻撃！" + target.getName() + "に5のダメージを与えた！");
        target.setHp(target.getHp() - 5);
    }
}
