
public class Fighter extends Character {

    public Fighter(String n, String r) {
        super(n, r);
    }

   
   

    protected int hpget(int c) {
 int hp=10;
 return hp = 10+c;
    }

  
    protected int acget(char t,int d) {
        if(t=='a'){
            return ac= 16+2;
        }
        else{
            return ac= 11+d;
        }
    }

 
 
    protected int perception(int w) {
        int perc=10;
       w=modgetter(getWis());
       return perc=10+w;
    }

  
    

 
    protected int getmoney() {
        int money =5*(int)(Math.random()*4+1)*10;
        return money;
    }

 
    protected void equipement(char a) {
     if( a=='a'){
        String dpack[]={"Backpack","Crowbar","Hammer","Piton x 10","Torch x 10","10 days of rations", " Waterskin"," 50 ft rope"};
         for (int i = 0; i < dpack.length; i++) {
             addEquip(dpack[i]);
             addEquip("Shield");
         }
         
         
       
    }
     else{
         String epack[]={"Backpack","Bedroll","Mess kit","Torch x 10","10 days of rations", " Waterskin"," 50 ft rope"};
         for (int i = 0; i < epack.length; i++) {
             addEquip(epack[i]);
         }
    }
    }

 
    public void FightingStyle(String style){
        if(style=="Archery"){
            addAbility("Archery: You gain a +2 bonus to attack rolls you make with ranged weapons.");
        
        }
        else if(style=="Defense"){
            addAbility("Defense: While you are wearing armor, you gain a +1 bonus to AC.");
       ac++;
        }
        else if(style=="Two weapon fighting"){
            addAbility("Two-Weapon Fighting: When you engage in two-weapon fighting, you can add your ability modifier to the damage of the second attack.");
            
            
        }
        else
            addAbility("Great Weapon Fighting: When you roll a 1 or 2 on a damage die for an attack you make with a melee weapon that you are wielding with two hands, you can reroll the die and must use the new roll, even if the new roll is a 1 or a 2. The weapon must have the two-handed or versatile property for you to gain this benefit.");
        
    }

   
     
    

    
    protected void proficiencies() {
        addProf("Armor: All armor, shields");
        addProf("Weapons:All simple and martial weapons");
        addProf("");
    }


    
    protected void attacks(int m, int p, char a) {
           String Grtsword="Greatsword";

     String Lngbow="Longbow";
     String Mrningstar="Morningstar";
     String pike="Pike";
     String lCrossbow="Light Crossbow";
     String Handaxe="Handaxe";
    
     int sum= m+p;
     if(a=='a'){
         addAttack(Grtsword+" "+sum+" 2d6 +"+m);
         addAttack(lCrossbow+" "+sum+" 1d8 +"+m+" Range 80/320"); 
     }
     else if(a=='b'){
         addAttack(Lngbow+" "+sum+" 1d8"+m+" Range 150/600");
         addAttack(Handaxe+" "+sum+" 1d6 +"+m+" Range 20/60");
         addAttack(Handaxe+" "+sum+" 1d6 +"+m+" Range 20/60");
         addAttack(pike+" "+sum+" 1d10 +"+m);
         addAttack(Mrningstar+" "+sum+" 1d8 +"+m);
        
  
     
     }

    }

   
    protected void abilities() {
        addAbility("Second Wind: At first level, on your turn, you can use a bonus action to regain hit points equal to 1d10 + your fighter level. Once you use this feature, you must finish a short or long rest before you can use it again.");
    }
    }



 
    

