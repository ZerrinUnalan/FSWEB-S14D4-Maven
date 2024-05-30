package org.example.rpg;

public class RpgMain {
    public static void main(String[] args) {
        Monster troll  = new Troll("Troll Warrior", 5, 100);
        Monster elf = new Elf("Blood Elf", 50, 250);

        System.out.println(troll.attack());
        System.out.println(elf.attack());
    }
}