
public class Barbarian extends Character {

    public Barbarian(String n, String r) {
        super(n, r);
    }

   
    protected int hpget(int c) {
        int hp=12;
        return 12+c;
    }

 
    protected int acget(char a,int d) {
       int hp= 10;
       int c=getCon();
       return 10+d+c;
    }


    protected void equipement(char a) {
          String epack[]={"Backpack","Bedroll","Mess kit","Torch x 10","10 days of rations", " Waterskin"," 50 ft rope"};
         for (int i = 0; i < epack.length; i++) {
             addEquip(epack[i]);
         }
    }

    @Override
    protected void proficiencies() {
        addProf("Armor: Light armor, medium armor, shields");
        addProf("Weapons: Simple weapons, martial weapons");
        addProf("Tools:none");
        
    }

    @Override
    protected void attacks(int m, int p, char a) {
        int sum= m+p;
        if(a=='a'){
            addAttack("Greataxe "+sum+"\t1d12+"+m);
            addAttack("Javelin x4"+sum+"\t1d6+"+m+"Range 30/120");
             addAttack("Handaxe"+sum+"\t1d6 +"+m+" Range 20/60");
         addAttack("Handaxe"+sum+"\t1d6 +"+m+" Range 20/60");
        }
        else{
            addAttack("Glaive "+sum+"\t1d10+"+m);
            addAttack("Sling"+sum+"\t1d4+"+m);
            addAttack("Javelin x4"+sum+"\t1d6+"+m+"Range 30/120");
        }
    }

    
    protected void abilities() {
        addAbility("Rage:On your turn, you can enter a rage as a bonus action. While raging, you gain the following benefits if you aren't wearing heavy armor:\n" +
"\n" +
"You have advantage on all Strength checks and Strength saving throws.\n" +
"When you make a melee weapon attack using Strength, you gain a bonus to the damage roll that increases as you gain levels as a barbarian, as shown in the Rage Damage column of the Barbarian table.\n" +
"You have resistance to bludgeoning, piercing, and slashing damage.\n" +
"If you are able to cast spells, you can't cast them or concentrate on them while raging.\n" +
"\n" +
"Your rage lasts for 1 minute. It ends early if you are knocked unconscious or if your turn ends and you haven't attacked a hostile creature since your last turn or taken damage since then. You can also end your rage on your turn as a bonus action.\n" +
"\n" +
"Once you have raged the number of times shown for your barbarian level in the Rages column of the Barbarian table, you must finish a long rest before you can rage again.");
        addAbility("Unarmored Defence:While you are not wearing any armor, your Armor Class equals 10 + your Dexterity modifier + your Constitution modifier. You can use a shield and still gain this benefit.\n" );
    }
    

 
    protected int perception(int w) {
           int perc=10;
       w=modgetter(getWis());
       return perc=10+w;
    }

    @Override
    protected int getmoney() {
         int money =2*(int)(Math.random()*4+1)*10;
        return money;
    }

   
    
}
