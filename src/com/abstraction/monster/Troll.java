package com.abstraction.monster;

public class Troll extends  Monster implements  Bleedable{

    public Troll (String name , int hitPoints , double damage){
        super (name, hitPoints, damage);
    }
    @Override
    public double attack() {
        return getDamage() + bleed();
    }
    @Override
    public double bleed() {
        return getDamage() * 0.25;
    }
}
