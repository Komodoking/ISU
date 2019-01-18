
public class Fighter extends Character {

    public Fighter(String n, String r) {
        super(n, r);
    }

   
   

    protected void hpget(int c) {
 int hp=10;
 hp= 10+c;
    }

  
    protected void acget(char t,int d) {
        if(t=='c'){
            ac= 16;
        }
        else{
            ac= 11+d;
        }
    }

 
 
    protected void perception(int w) {
        int perc=10;
       w=modgetter(getWis());
       perc=10+w;
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

 
    public void FightingStyle(String style){
        if(style=="Archery"){
            addAbility("Archery: You gain a +2 bonus to attack rolls you make with ranged weapons.");
        
        }
        else if(style=="Defence"){
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

    @Override
    protected String attacks1(int m, int p, String attacks1) {
         String Grtsword="Greatsword";
     String Lngsword="Longsword";
     String Mrningstar="Morningstar";
     String pike="Pike";
     String lCrossbow="Light Crossbow";
     String Handaxe="Handaxe";
     String Shortbow="Short bow";
     String Battleaxe="Battleaxe";
     int sum= m+p;
     if(attacks1.equals(Grtsword)){
         return Grtsword+"\t"+sum+"\t2d6 +"+m;
     }
      if(attacks1.equals(Lngsword)){
         return Lngsword+"\t"+sum+"\t1d10 +"+m;
     }
       if(attacks1.equals(pike)){
         return pike+"\t"+sum+"\t1d10 +"+m;
     }
        if(attacks1.equals(Mrningstar)){
         return Mrningstar+"\t"+sum+"\t1d8 +"+m;
     }
        if(attacks1.equals(lCrossbow)){
         return lCrossbow+"\t"+sum+"\t1d8 +"+m+" Range 80/320";
     }
         if(attacks1.equals(Handaxe)){
         return Handaxe+"\t"+sum+"\t1d6 +"+m+" Range 20/60";
     }
          if(attacks1.equals(Shortbow)){
         return Shortbow+"\t"+sum+"\t1d6 +"+m+" Range 80/320";
     }
           if(attacks1.equals(Battleaxe)){
         return Battleaxe+"\t"+sum+"\t1d8 +"+m;
     }
           else
               return"Invalid weapon";
    }

    @Override
    protected String attacks2(int m, int p, String attacks2) {
           String Grtsword="Greatsword";
     String Lngsword="Longsword";
     String Mrningstar="Morningstar";
     String pike="Pike";
     String lCrossbow="Light Crossbow";
     String Handaxe="Handaxe";
     String Shortbow="Short bow";
     String Battleaxe="Battleaxe";
     int sum= m+p;
     if(attacks2.equals(Grtsword)){
         return Grtsword+"\t"+sum+"\t2d6 +"+m;
     }
      if(attacks2.equals(Lngsword)){
         return Lngsword+"\t"+sum+"\t1d10 +"+m;
     }
       if(attacks2.equals(pike)){
         return pike+"\t"+sum+"\t1d10 +"+m;
     }
        if(attacks2.equals(Mrningstar)){
         return Mrningstar+"\t"+sum+"\t1d8 +"+m;
     }
        if(attacks2.equals(lCrossbow)){
         return lCrossbow+"\t"+sum+"\t1d8 +"+m+" Range 80/320";
     }
         if(attacks2.equals(Handaxe)){
         return Handaxe+"\t"+sum+"\t1d6 +"+m+" Range 20/60";
     }
          if(attacks2.equals(Shortbow)){
         return Shortbow+"\t"+sum+"\t1d6 +"+m+" Range 80/320";
     }
           if(attacks2.equals(Battleaxe)){
         return Battleaxe+"\t"+sum+"\t1d8 +"+m;
     }
           else
               return"Invalid weapon";
    }
    }



 
    

