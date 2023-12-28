package com.abstraction.store;

import com.abstraction.monster.Monster;
import com.abstraction.monster.Troll;
import com.abstraction.monster.Werewolf;

public class MonsterMain {
    public static void main(String[] args) {
        Monster wereWolf = new Werewolf("Comar",540,7.4);
        Monster troll = new Troll("Max" ,1250 ,9.5);

        System.out.println(wereWolf.attack());
        System.out.println(troll.attack());
    }
}
