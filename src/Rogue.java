
public class Rogue extends Character{

    public Rogue(String n, String r) {
        super(n, r);
    }

    @Override
    protected int hpget(int c) {
           int hp = 8;
        return hp + c;
    }

    @Override
    protected int acget(char t, int d) {
        return 11 + d;
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
        addProf("Armor: Light armor");
        addProf("Weapons: Simple Weapons, hand crossbows, longswords, rapiers, shortswords");
        addProf("Tools:Theives Tools");
    }

    
    protected void attacks(int m, int p, char a) {
      int sum=m+p;
        if(a=='a'){
          addAttack("Rapier " + sum + " 1d6+ " + m);
            addAttack("Shortbow "+sum+" 1d6+ "+m+"Range:80/320");
      }
      else{
          addAttack("Shortsword "+sum+" 1d6+ "+m);
          addAttack("Shortsword "+sum+" 1d6+ "+m);
      }
    }

    @Override
    protected void abilities() {
        addAbility("Expertise:Your proficiency when using theives tools is doubled");
        addAbility("Sneak Attack:Once per turn, you can deal extra 1d6 damage to one creature you hit with an attack if you have advantage on the attack roll. The attack must use a finesse or a ranged weapon.\n" +
"\n" +
"You don't need advantage on the attack roll if another enemy of the target is within 5 feet of it, that enemy isn't incapacitated, and you don't have disadvantage on the attack roll.\n" +
"\n" +
"The amount of the extra damage increases as you gain levels in this class, as shown in the Sneak Attack column of the Rogue table.");
        addAbility("During your rogue training you learned thieves' cant, a secret mix of dialect, jargon, and code that allows you to hide messages in seemingly normal conversation. Only another creature that knows thieves' cant understands such messages. It takes four times longer to convey such a message than it does to speak the same idea plainly.\n" +
"\n" +
"In addition, you understand a set of secret signs and symbols used to convey short, simple messages, such as whether an area is dangerous or the territory of a thieves' guild, whether loot is nearby, or whether the people in an area are easy marks or will provide a safe house for thieves on the run.\n" +
"");
    }

  
    protected int perception(int w) {
       int perc=10;
       w=modgetter(getWis());
       return perc=10+w+pb;
    }

    @Override
    protected int getmoney() {
        int money =4*(int)(Math.random()*4+1)*10;
        return money;
    }
    
}
