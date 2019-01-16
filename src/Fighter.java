/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ajdy5510
 */
public class Fighter extends Character {

    public Fighter(String n) {
        super(n);
    }


    protected int hpget(int c) {
 int hp=10;
 return 10+c;
    }

  
    protected int acget(char t,int d) {
        if(t=='c'){
            return 16+2;
        }
        else{
            return 11+d+2;
        }
    }

 
 
    protected int perception(int w) {
        int perc=10;
        return perc+w;
    }

  
    protected void magicuse() {
        int splslot=0;
        int splattack=0;
        int spldc=0;
    }

 
    protected int getmoney() {
        int money =5*(int)(Math.random()*4+1)*10;
        return money;
    }

 
    protected String[] equipement(char a) {
     if( a=='a'){
        String dpack[]={"Backpack","Crowbar","Hammer","Piton x 10","Torch x 10","10 days of rations", " Waterskin"," 50 ft rope"};
        
              return dpack;
         
       
    }
     else{
         String epack[]={"Backpack","Bedroll","Mess kit","Torch x 10","10 days of rations", " Waterskin"," 50 ft rope"};
     return epack;
    }
    }

    
    protected String[] abilities() {
        
    }
    public String FightingStyle(String style){
        if(style=="Archery"){
        return "Archery: You gain a +2 bonus to attack rolls you make with ranged weapons.";
        
        }
        else if(style=="Defence"){
        return "Defense: While you are wearing armor, you gain a +1 bonus to AC.";
        }
        else if(style=="Two weapon fighting"){
            return"Two-Weapon Fighting: When you engage in two-weapon fighting, you can add your ability modifier to the damage of the second attack.";
            
        }
        else
            return"Great Weapon Fighting: When you roll a 1 or 2 on a damage die for an attack you make with a melee weapon that you are wielding with two hands, you can reroll the die and must use the new roll, even if the new roll is a 1 or a 2. The weapon must have the two-handed or versatile property for you to gain this benefit.";
        
    }

    protected String[] attacks(int m, int p) {
     String Grtsword="greatsword";
     String Lngsword="Longsword";
     String Mrningstar="Morningstar";
     String pike="Pike";
     
     
    }

 
    
}
