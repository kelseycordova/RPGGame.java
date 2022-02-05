package com.company;

public class Hero {
    private String name;
    private int health;
    private int armorValue;
    private int weaponDamage;
    private String weaponType;
    private int strength;
    private int agility;

    public Hero() {
        this.setHero("No Name", 100, 10, 4, "Fist", 10, 10);
    }

    public Hero(String newName, int newHealth, int newArmorValue, int newWeaponDamage, String newWeaponType, int newStrength, int newAgility) {
        this.setHero(newName, newHealth, newArmorValue, newWeaponDamage, newWeaponType, newStrength, newAgility);
    }

    public void setHero(String newName, int newHealth, int newArmorValue, int newWeaponDamage, String newWeaponType, int newStrength, int newAgility) {
        this.name = newName;
        this.health = newHealth;
        this.armorValue = newArmorValue;
        this.weaponDamage = newWeaponDamage;
        this.weaponType = newWeaponType;
        this.strength = newStrength;
        this.agility = newAgility;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setHealth(int newHealth) {
        this.health = newHealth;
    }

    public int getHealth() {
        return this.health;
    }

    public int getStrength() {
        return this.strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void jump() {
        int distance = this.agility + this.strength + (int)Math.random() * 4 + 1 - this.armorValue;
        System.out.println(this.name + "jumped " + distance + " inches.");
    }

    public void attack(Hero otherHero) {
        int damage = (int)(Math.random() * (double)this.weaponDamage + 1.0D + (double)this.strength);
        otherHero.health -= damage;
        System.out.println(this.name + " attacked " + otherHero.name + " with their " + this.weaponType + " for " + damage + " damage!");
        System.out.println(otherHero.name + " now has " + otherHero.health + " health.");
    }

    public static void duel(Hero h1, Hero h2) {
        boolean herosNotDead = true;
        int count = 1;

        while(herosNotDead) {
            System.out.println("Round " + count + " ... Fight");
            h1.attack(h2);
            h2.attack(h1);
            herosNotDead = h1.getHealth() > 0 && h2.getHealth() > 0;
            ++count;
            System.out.println("------------");
        }

    }
}
