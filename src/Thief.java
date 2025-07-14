public class Thief extends Character{

    Thief(String name,int hp){
        this.setName(name);
        this.setHp(hp);
    }

    @Override
    public void attack(Creature target) {
        System.out.println(this.getName() + "は素早く攻撃した！" + target.getName() + "に5のダメージを与えた！");
        target.setHp(target.getHp() - 5);
    }
}
