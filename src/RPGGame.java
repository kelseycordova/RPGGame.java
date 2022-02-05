
package com.company;

public class RPGGame {
    public RPGGame() {
    }

    public static void main(String[] args) {
        Hero Bob = new Hero();
        Hero MasterChief = new Hero();
        MasterChief.setHero("Master Chief", 100, 24, 10, "Energy Sword", 20, 10);
        Hero.duel(Bob, MasterChief);
    }
}
