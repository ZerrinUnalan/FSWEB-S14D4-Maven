package org.example.rpg;

public class Troll extends Monster implements Bleedable, Poisonable {

    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed() {
        return super.getDamage()*0.25;
    }

    @Override
    public double poison() {
        return super.getDamage()*0.3;
    }

    @Override
    public double attack() {
        return super.getDamage() + bleed() + poison();
    }
}
