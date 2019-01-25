
import java.util.ArrayList;


public class Wizard extends Character {
int splattack, splsave, splslots=2; 
ArrayList <String> cantriplist;
ArrayList <String> spelllist;

    public Wizard(String n, String r) {
        super(n, r);
        splattack=getIint()+pb;
        splsave=8+pb+getIint();
      
spelllist=new ArrayList<String>();
cantriplist=new ArrayList<String>();
    }

 
    protected int hpget(int c) {
      int hp=6;
      return 6+c;
    }

    
    protected int acget(char t, int d) {
       int base=10;
       return base+d;
    }

    
    protected void equipement(char a) {
   if(1=='a'){
       String spack[]={"Backpack"," Book of lore ","Bottle of ink ", "Ink pen"," 10 sheets of Parchement "," small bag of sand "};
       for (int i = 0; i < spack.length; i++) {
           addEquip(spack[i]);
       }
       addEquip("Component pouch");
       
   }
   
       else{
         String epack[]={"Backpack","Bedroll","Mess kit","Torch x 10","10 days of rations", " Waterskin"," 50 ft rope"};
         for (int i = 0; i < epack.length; i++) {
             addEquip(epack[i]);
            
         } 
         addEquip("Wizard Wand");
               }
  
    }
      public final void addCantrip(String can){
         cantriplist.add(can);
   }
   
   
   public final ArrayList<String> getCantrip(){
       return  cantriplist;
   }
      public final void addSpell(String spell){
         spelllist.add(spell);
   }
   
   
   public final ArrayList<String> getSpell(){
       return  spelllist;
   }
    protected void cantrips(char a){
    if(a=='a'){
        addCantrip("Acid Splash: You hurl a bubble of acid. Choose one creature within range, or choose two creatures within range that are within 5 feet of each other. A target must succeed on a Dexterity saving throw or take 1d6 acid damage.\n" +
"\n" +
"This spell’s damage increases by 1d6 when you reach 5th level (2d6), 11th level (3d6), and 17th level (4d6).");
         addCantrip("Light: You touch one object that is no larger than 10 feet in any dimension. Until the spell ends, the object sheds bright light in a 20-foot radius and dim light for an additional 20 feet. The light can be colored as you like. Completely covering the object with something opaque blocks the light. The spell ends if you cast it again or dismiss it as an action. \n" +
"If you target an object held or worn by a hostile creature, that creature must succeed on a Dexterity saving throw to avoid the spell.");
        
        addCantrip("Minor Illusion: You create a sound or an image of an object within range that lasts for the duration. The illusion also ends if you dismiss it as an action or cast this spell again. \n" +
"If you create a sound, its volume can range from a whisper to a scream. It can be your voice, someone else's voice, a lion's roar, a beating of drums, or any other sound you choose. The sound continues unabated throughout the duration, or you can make discrete sounds at different times before the spell ends. \n" +
"If you create an image of an object--such as a chair, muddy footprints, or a small chest--it must be no larger than a 5-foot cube. The image can't create sound, light, smell, or any other sensory effect. Physical interaction with the image reveals it to be an illusion, because things can pass through it. \n" +
"If a creature uses its action to examine the sound or image, the creature can determine that it is an illusion with a successful Intelligence (Investigation) check against your spell save DC. If a creature discerns the illusion for what it is, the illusion becomes faint to the creature.");
    }
       
        else{
                addCantrip("Fire Bolt:You hurl a mote of fire at a creature or object within range. Make a ranged spell attack against the target. On a hit, the target takes 1d10 fire damage. A flammable object hit by this spell ignites if it isn't being worn or carried. \n" +
"This spell's damage increases by 1d10 when you reach 5th level (2d10), 11th level (3d10), and 17th level (4d10).");
                addCantrip("Prestidiitation: This spell is a minor magical trick that novice spellcasters use for practice. You create one of the following magical effects within range:\n" +
"\n" +
"You create an instantaneous, harmless sensory effect, such as a shower of sparks, a puff of wind, faint musical notes, or an odd odor.\n" +
"You instantaneously light or snuff out a candle, a torch, or a small campfire.\n" +
"You instantaneously clean or soil an object no larger than 1 cubic foot.\n" +
"You chill, warm, or flavor up to 1 cubic foot of nonliving material for 1 hour.\n" +
"You make a color, a small mark, or a symbol appear on an object or a surface for 1 hour.\n" +
"You create a nonmagical trinket or an illusory image that can fit in your hand and that lasts until the end of your next turn.\n" +
"If you cast this spell multiple times, you can have up to three of its non-instantaneous effects active at a time, and you can dismiss such an effect as an action.");
                addCantrip("Mage Hand: A spectral, floating hand appears at a point you choose within range. The hand lasts for the duration or until you dismiss it as an action. The hand vanishes if it is ever more than 30 feet away from you or if you cast this spell again. \n" +
"You can use your action to control the hand. You can use the hand to manipulate an object, open an unlocked door or container, stow or retrieve an item from an open container, or pour the contents out of a vial. You can move the hand up to 30 feet each time you use it. \n" +
"The hand can't attack, activate magic items, or carry more than 10 pounds.");
                }
        
    }
protected void spelllist(char a){
    if(a=='a'){
        addSpell("Mage Armor:You touch a willing creature who isn't wearing armor, and a protective magical force surrounds it until the spell ends. The target's base AC becomes 13 + its Dexterity modifier. The spell ends if the target dons armor or if you dismiss the spell as an action.");
        addSpell("Thunderwave:A wave of thunderous force sweeps out from you. Each creature in a 15-foot cube originating from you must make a Constitution saving throw. On a failed save, a creature takes 2d8 thunder damage and is pushed 10 feet away from you. On a successful save, the creature takes half as much damage and isn't pushed. \n" +
"In addition, unsecured objects that are completely within the area of effect are automatically pushed 10 feet away from you by the spell's effect, and the spell emits a thunderous boom audible out to 300 feet.");
        
    }
    else{
        addSpell("Charm Person:You attempt to charm a humanoid you can see within range. It must make a Wisdom saving throw, and does so with advantage if you or your companions are fighting it. If it fails the saving throw, it is charmed by you until the spell ends or until you or your companions do anything harmful to it. The charmed creature regards you as a friendly acquaintance. When the spell ends, the creature knows it was charmed by you.");
        addSpell("Magic Missle:You create three glowing darts of magical force. Each dart hits a creature of your choice that you can see within range. A dart deals 1d4 + 1 force damage to its target. The darts all strike simultaneously, and you can direct them to hit one creature or several.");
    }
}

    protected void attacks(int m, int p, char a) {
        int sum=m+p;
        if(a=='a'){
            addAttack("Quarter Staff "+sum+" 1d6+ "+m);
            addAttack("Acid Splash "+"Dex Save:"+splsave+"\t1d6+"+splattack);
            addAttack("Thunderwave: "+"Con Save: "+splsave+"\t2d8"+splattack);
        }
        else{
            addAttack("Dagger "+sum+" 1d4+ "+m);
            addAttack("Firebolt "+splattack+" 1d10+ "+splattack);
            addAttack("Magic Missle(x3):"+"Negate accuracy"+" 1d4+1 "+splattack);
        }
        
    }


    protected int perception(int w) {
         int perc=10;
       w=modgetter(getWis());
       return perc=10+w;
    }

    protected int getmoney() {
           int money =4*(int)(Math.random()*4+1)*10;
        return money;
    }

   
    protected void abilities() {
        addAbility("Spellcasting: you can cast spells from your spell list, your modifier is intelligence. This is due to your immense amount of time studying magic by yourself, or at a school");
        addAbility("Arcane Recovery:Once per day when you finish a short rest, you can choose expended spell slots to recover. The spell slots can have a combined level that is equal to or less than half your wizard level (rounded up), and none of the slots can be 6th level or higher.");
    }

 
    protected void proficiencies() {
        addProf("Armor: None");
        addProf("Daggers, Darts, Slings, Quarterstaffs, Lightcrossbows");
        addProf("Tools: None");
    }
    
}
