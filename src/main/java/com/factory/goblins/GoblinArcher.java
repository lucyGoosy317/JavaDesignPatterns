package com.factory.goblins;


public class GoblinArcher extends Goblin { //could also use implement Goblin

   
   public GoblinArcher(String goblinType){
    super(goblinType);
    setHP(30);
   }


@Override
public void attack() {
    System.out.println(goblinType + " Attacks with a swift arrow from their bow!\n");
    
}

    
}