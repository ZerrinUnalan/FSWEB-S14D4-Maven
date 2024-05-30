package org.example.rpg;

public class Elf extends Monster implements Bleedable{
    public Elf (String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double attack() {
        return getDamage() + bleed();
    }

    @Override
    public double bleed() {
        return getDamage() * 0.2;
    }
}