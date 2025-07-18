import java.util.ArrayList;

public class GameMaster {
    public static void main(String[] args) {
        Hero h = new Hero("勇者",100,"剣");
        Wizard w = new Wizard("魔法使い",60,20);
        Thief t = new Thief("盗賊",70);

        ArrayList<Character> party = new ArrayList<Character>();
        party.add(h);
        party.add(w);
        party.add(t);

        Goblin g1 = new Goblin('A',50);
        Matango m1 = new Matango('A',45);
        Slime s1 = new Slime('A',40);

        ArrayList<Monster> monsters = new ArrayList<Monster>();
        monsters.add(m1);
        monsters.add(g1);
        monsters.add(s1);


        System.out.println("---味方パーティ---");
        for(Character i : party) {
            i.showStatus();
        }

        System.out.println("---敵グループ---");
        for(Monster i : monsters) {
            i.showStatus();
        }

        System.out.println("\n味方の総攻撃！");
        for(Character i : party) {
            for(Monster j : monsters) {
                i.attack(j);
            }
        }

        System.out.println("\n敵の総攻撃！");
        for(Monster j : monsters) {
            for(Character i : party) {
                j.attack(i);
            }
        }

        System.out.println("\nダメージを受けた勇者が突然光りだした！");
        SuperHero sh = new SuperHero(h);
        party.set(0,sh);
        for(Monster i : monsters) {
            sh.attack(i);
        }

        System.out.println("\n---味方パーティ最終ステータス---");
        for(Character i : party) {
            i.showStatus();
            i.isAlive();
            if (i.isAlive()){
                System.out.println("生存状況:生存");
            }else {
                System.out.println("生存状況:戦闘不能");
            }
        }

        System.out.println("\n---敵グループ最終ステータス---");
        for(Monster i : monsters) {
            i.showStatus();
            i.isAlive();
            if (i.isAlive()){
                System.out.println("生存状況:生存");
            }else {
                System.out.println("生存状況:討伐済み");
            }
        }
    }
}
