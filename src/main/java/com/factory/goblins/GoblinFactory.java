package com.factory.goblins;


public class GoblinFactory {

    

    public Goblin getGoblintype(String goblinType){
        switch(goblinType){
            case "GoblinWarrior":
                System.out.println(goblinType+ " Unit Created");
                return new GoblinWarrior(goblinType);
            case "GoblinArcher":
                System.out.println(goblinType+ " Unit Created");
                 return new GoblinArcher(goblinType);
            case "GoblinMage":
                System.out.println(goblinType+ " Unit Created");
                return new GoblinMage(goblinType);
            default:
                System.out.println("Unit not does not exist");
                return null;
        } 
        
    }

}