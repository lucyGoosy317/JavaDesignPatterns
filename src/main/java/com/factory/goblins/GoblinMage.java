package com.factory.goblins;



public class GoblinMage extends Goblin {

    
    public GoblinMage(String goblinType){
        super(goblinType);
        setHP(25);
    }

    @Override
    public void attack() {
    System.out.println(goblinType + " Attacks with a strong gust of magic!\n");
    }
    

}