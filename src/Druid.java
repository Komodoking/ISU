
import java.util.ArrayList;


public class Druid extends Character {
   int splattack, splsave, splslots = 2;
    ArrayList<String> cantriplist;
    ArrayList<String> spelllist;
    public Druid(String n, String r) {
        super(n, r);
         splattack = modgetter(getWis()) + pb;
        splsave = 8 + pb + modgetter(getWis());
        spelllist=new ArrayList<String>();
cantriplist=new ArrayList<String>();
    }

    protected int hpget(int c) {
          int hp = 8;
        return hp + c;
    }

   
    protected int acget(char t, int d) {
          return 11 + d+2;
    }

    protected void equipement(char a) {
         String epack[]={"Backpack","Bedroll","Mess kit","Torch x 10","10 days of rations", " Waterskin"," 50 ft rope"};
         for (int i = 0; i < epack.length; i++) {
             addEquip(epack[i]);
         }
         addEquip("Druid Staff");
    }

 
    protected void proficiencies() {
        addProf("Armor: Light armor, medium armor, shields (druids will not wear armor or use shields made of metal) ");
        addProf("Weapons: Clubs, daggers, darts, javelins, maces, quarterstaffs, scimitars, sickles, slings, spears ");
        addProf("Tools: Herbalism kit ");
    }

    
    protected void attacks(int m, int p, char a) {
        int sum=m+p;
        if(a=='a'){
            addAttack("Schimitar "+sum+" 1d6+ "+m);
            addAttack("Produce Flame:"+splattack+" 1d8+ "+splattack);
            
        }else{
            addAttack("Mace "+sum+" 1d6+ "+m);
        addAttack("Dagger "+sum+" 1d4+ "+m+" Range 20/60");
              addAttack("Thunderwave: "+"Con Save: "+splsave+" d8"+splattack);
        }
    }

   
    protected void abilities() {
        addAbility("Druidic: You know Druidic, the secret language of druids. You can speak the language and use it to leave hidden messages. You and others who know this language automatically spot such a message. Others spot the message's presence with a successful DC 15 Wisdom (Perception) check but can't decipher it without magic.");
        addAbility("Spellcasting: You have spent many years in the wilderness, and using the power of nature, you can cast spells. Your spell casting modifier is Wisdom");
    }


    protected int perception(int w) {
            int perc=10;
       w=modgetter(getWis());
       return perc=10+w;
    }

    
    protected int getmoney() {
          int money =2*(int)(Math.random()*4+1)*10;
        return money;
    }
protected void CantripList(char a){
        if(a=='a'){
            addCantrip("Produce Flame:A flickering flame appears in your hand. The flame remains there for the duration and harms neither you nor your equipment. The flame sheds bright light in a 10-foot radius and dim light for an additional 10 feet. The spell ends if you dismiss it as an action or if you cast it again. \n" +
"You can also attack with the flame, although doing so ends the spell. When you cast this spell, or as an action on a later turn, you can hurl the flame at a creature within 30 feet of you. Make a ranged spell attack. On a hit, the target takes 1d8 fire damage. \n" +
"This spell's damage increases by 1d8 when you reach 5th level (2d8), 11th level (3d8), and 17th level (4d8).");
            addCantrip("Druidcraft:Whispering to the spirits of nature, you create one of the following effects within range: You create a tiny, harmless sensory effect that predicts what the weather will be at your location for the next 24 hours. The effect might manifest as a golden orb for clear skies, a cloud for rain, falling snowflakes for snow, and so on. This effect persists for 1 round. You instantly make a flower blossom, a seed pod open, or a leaf bud bloom. You create an instantaneous, harmless sensory effect, such as falling leaves, a puff of wind, the sound of a small animal, or the faint odor of skunk. The effect must fit in a 5-foot cube. You instantly light or snuff out a candle, a torch, or a small campfire.");
            
        }
        else{
            addCantrip("Guidance:You touch one willing creature. Once before the spell ends, the target can roll a d4 and add the number rolled to one ability check of its choice. It can roll the die before or after making the ability check. The spell then ends.");
            addCantrip("Shillelagh:The wood of a club or quarterstaff you are holding is imbued with nature's power. For the duration, you can use your spellcasting ability instead of Strength for the attack and damage rolls of melee attacks using that weapon, and the weapon's damage die becomes a d8. The weapon also becomes magical, if it isn't already. The spell ends if you cast it again or if you let go of the weapon.");
        }
    }
    protected void SpellList(char a){
        if(a=='a'){
            addSpell("Create or Destroy water:You either create or destroy water. \n" +
"Create Water. You create up to 10 gallons of clean water within range in an open container. Alternatively, the water falls as rain in a 30-foot cube within range, extinguishing exposed flames in the area. \n" +
"Destroy Water. You destroy up to 10 gallons of water in an open container within range. Alternatively, you destroy fog in a 30-foot cube within range.\n" +
"\n" +
"At Higher Levels. When you cast this spell using a spell slot of 2nd level or higher, you create or destroy 10 additional gallons of water, or the size of the cube increases by 5 feet, for each slot level above 1st.");
            addSpell("Good Berry:Up to ten berries appear in your hand and are infused with magic for the duration. A creature can use its action to eat one berry. Eating a berry restores 1 hit point, and the berry provides enough nourishment to sustain a creature for one day. \n" +
"The berries lose their potency if they have not been consumed within 24 hours of the casting of this spell.");
            
        }
        else{
            addSpell("Thunderwave:A wave of thunderous force sweeps out from you. Each creature in a 15-foot cube originating from you must make a Constitution saving throw. On a failed save, a creature takes 2d8 thunder damage and is pushed 10 feet away from you. On a successful save, the creature takes half as much damage and isn't pushed. \n" +
"In addition, unsecured objects that are completely within the area of effect are automatically pushed 10 feet away from you by the spell's effect, and the spell emits a thunderous boom audible out to 300 feet.");
        addSpell("Healing Word(AKA best spell in the game):A creature of your choice that you can see within range regains hit points equal to 1d4 + your spellcasting ability modifier. This spell has no effect on undead or constructs. At Higher Levels. When you cast this spell using a spell slot of 2nd level or higher, the healing increases by 1d4 for each slot level above 1st.");
        }
    }
       public final void addCantrip(String can) {
        cantriplist.add(can);
    }

    public final ArrayList<String> getCantrip() {
        return cantriplist;
    }

    public final void addSpell(String spell) {
        spelllist.add(spell);
    }

    public final ArrayList<String> getSpell() {
        return spelllist;
    }
}
