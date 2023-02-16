package com.factory.goblins;



public class GoblinWarrior extends Goblin{

    
    
    GoblinWarrior(String goblinType){
        super(goblinType);
        setHP(100);
    }


    @Override
    public void attack() {
    System.out.println(goblinType + " Attacks with a strong swing from an axe!\n");
    }

    
    
    
}