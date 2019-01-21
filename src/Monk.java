
public class Monk extends Character {

    public Monk(String n, String r) {
        super(n, r);
    }

    @Override
    protected int hpget(int c) {
          int hp = 8;
        return hp + c;
    }

    @Override
    protected int acget(char t, int d) {
        int hp= 10;
       int c=getWis();
       return 10+d+c;
    }

    @Override
    protected void equipement(char a) {
         if( a=='a'){
        String dpack[]={"Backpack","Crowbar","Hammer","Piton x 10","Torch x 10","10 days of rations", " Waterskin"," 50 ft rope"};
         for (int i = 0; i < dpack.length; i++) {
             addEquip(dpack[i]);
            
         }
         
         
       
    }
     else{
         String epack[]={"Backpack","Bedroll","Mess kit","Torch x 10","10 days of rations", " Waterskin"," 50 ft rope"};
         for (int i = 0; i < epack.length; i++) {
             addEquip(epack[i]);
         }
    }
    }
    
    protected void proficiencies() {
        addProf("Armor:none");
        addProf("Weapons:Simple weapons,shortswords");
        addProf("Tools:Drums");
    }

    @Override
    protected void attacks(int m, int p, char a) {
        int sum=m+p;
        if(a=='a'){
            addAttack("Shortsword "+sum+"\t1d6+ "+m);
            addAttack("Unarmed Strike "+sum+"\t1d4 "+m);
             addAttack("Dart x10 "+sum+"\t1d4 "+m+" Range: 20/60");
        }
        else{
            addAttack("Spear "+sum+"\t1d6 "+m+" Range: 20/60");
            addAttack("Unarmed Strike "+sum+"\t1d4 "+m);
            addAttack("Dart x10 "+sum+"\t1d4 "+m+" Range: 20/60");
        }
    }

    @Override
    protected void abilities() {
        addAbility("Martial Arts:At 1st level, you gain the following benefits while you are unarmed or wielding only monk weapons and you aren't wearing armor or wielding a shield:\n" +
"\n" +
"You can use Dexterity instead of Strength for the attacks and damage rolls of your unarmed strikes and monk weapons.\n" +
"You can roll a d4 in place of the normal damage of your unarmed strike or monk weapon. This die changes as you gain monk levels, as shown in the Martial Arts column of the Monk table\n" +
"When you use the Attack action with an unarmed strike or a monk weapon, you can make one unarmed strike as a bonus action. For example, if you take the Attack action and attack with a quarterstaff, you can also make an unarmed strike as a bonus action, assuming you haven't already taken a bonus action this turn.\n" +
"Monk weapons are shortswords and simple melee weapons that don't have the heavy or two-handed property.");
        addAbility("At 1st level, while you are wearing no armor and are not wielding a shield, your AC equals 10 + Dexterity modifier + your Wisdom modifier.");
    }

    @Override
    protected int perception(int w) {
         int perc=10;
       w=modgetter(getWis());
       return perc=10+w+pb;
    }

    @Override
    protected int getmoney() {
           int money =5*(int)(Math.random()*4+1)*10;
        return money;
    }
    
}
