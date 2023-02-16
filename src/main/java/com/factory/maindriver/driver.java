package com.factory.maindriver;

import com.factory.goblins.Goblin;
import com.factory.goblins.GoblinFactory;

public class driver {
public static void main(String [] args){
    GoblinFactory goblinFactory= new GoblinFactory();


    System.out.println("**************************************");
    System.out.println("I NEED ME SOME GOBLINS Lets Make SOME!");
    
    Goblin Rage = goblinFactory.getGoblintype("GoblinWarrior");
    Rage.attack();
    
    Rage.displayStats();
    
    Goblin Ranger = goblinFactory.getGoblintype("GoblinArcher");
    Ranger.attack();
    Ranger.displayStats();
    
    Goblin FlameCaster = goblinFactory.getGoblintype("GoblinMage");
    FlameCaster.attack();
    FlameCaster.displayStats();
    

    
    System.out.println("**************************************");
    
}

}