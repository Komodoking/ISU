
public class Paladin extends Character{

    public Paladin(String n, String r) {
        super(n, r);
    }

   
    protected int hpget(int c) {
        return 10+c;
    }


    protected int acget(char t, int d) {
        if(t=='a'){
            return 17+2+d;
        }
        else{
            return 17+d;
        }
    }

    
    protected void equipement(char a) {
     if(a=='a'){
         String ppack[]={"Backpack","Blanket","10 candles","Tinderbox","Alms box","2 blocks of incense","Censer","Vestements","2 days of Rations","Waterskin"};
         for (int i = 0; i < ppack.length; i++) {
             addEquip(ppack[i]);
         }
         addEquip("Holy Symbol");
     }
        else{
         String epack[]={"Backpack","Bedroll","Mess kit","Torch x 10","10 days of rations", " Waterskin"," 50 ft rope"};
         for (int i = 0; i < epack.length; i++) {
             addEquip(epack[i]);
         }
         addEquip("Holy Symbol");
    }
     
    }


    protected void proficiencies() {
       addProf("Armor: All armor, shields");
        addProf("Weapons:All simple and martial weapons");
        addProf("");
    }

    
    protected void attacks(int m, int p, char a) {
        int sum= m+p;
     if(a=='a'){
         addAttack("Greatsword"+sum+"\t2d6 +"+m);
         addAttack("Javelin x5"+sum+"\t1d6+"+m+"Range 30/120");
         
     }
     else{
         addAttack("Lance "+sum+"\t1d12+ "+m);
addAttack("Shortbow "+sum+"\t1d6+ "+m+"Range:80/320");
     }
    }

  
    protected void abilities() {
        addAbility("Lay on Hands:You have a pool of healing power that replenishes when you take a long rest. With that pool, you can restore a total number of hit points equal to your paladin level x 5. As an action, you can touch a creature and draw power from the pool to restore a number of hit points to that creature, up to the maximum amount remaining in your pool.\n" +
"\n" +
"Alternatively, you can expend 5 hit points from your pool of healing to cure the target of one disease or neutralize one poison affecting it. You can cure multiple diseases and neutralize multiple poisons with a single use of Lay on Hands, expending hit points separately for each one.\n" +
"\n" +
"This feature has no effect on undead and constructs.");
        addAbility("Divine Sense:As an action, until the end of your next turn, you know the location of any celestial, fiend, or undead within 60 feet of you that is not behind total cover. You know the type of any being whose presence you sense, but not its identity. Within the same radius, you also detect the presence of any place or object that has been consecrated or desecrated. You can use this feature a number of times equal to 1 + your Charisma modifier. When you finish a long rest, you regain all expended uses.");
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
    
}
