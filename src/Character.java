
import java.util.ArrayList;


public abstract class Character {
 static String name;
 
 protected ArrayList<String> abilities;
 protected ArrayList<String> prof;
  static  int pb=2;
    static String backstory;
   public Character(String n){
       n=name;
       abilities = new ArrayList<String>();
       prof= new ArrayList<String>();
   }
   public Character(String n, String r){
    n=name;
       abilities = new ArrayList<String>();
       prof= new ArrayList<String>();
       getRaceData(r);
   }
   abstract protected int hpget(int c);
   abstract protected int acget(char t, int d);
   abstract protected String[] equipement(char a);
   abstract protected String attacks1(int m,int p, String attacks1);
   abstract protected String attacks2(int m,int p, String attacks1);
   abstract protected int perception(int w);
   abstract protected int getmoney();
   
   
   public final void addAbility(String ab){
       abilities.add(ab);
   }
   
   
   public final ArrayList<String> getAbilities(){
       return abilities;
   }
    public final void addProf(String pr){
       prof.add(pr);
   }
   
   
   public final ArrayList<String> getProf(){
       return prof;
   }
   
   public final int getstrength(int e){
            StatGetter g= new StatGetter();
            return g.getStat(e);
   }
   
   public final int getDex(int e){
            StatGetter g= new StatGetter();
            return g.getStat(e);
   }
            
   public final int getCon(int e){
            StatGetter g= new StatGetter();
            return g.getStat(e);
   }
   
   public final int getInte(int e){
            StatGetter g= new StatGetter();
            return g.getStat(e);
   }
   
   public final int getWis(int e){
            StatGetter g= new StatGetter();
            return g.getStat(e);
   }
   
   public final int getChar(int e){
            StatGetter g= new StatGetter();
            return g.getStat(e);
   }
   
 public int modgetter(int score){
     if(score==30){
         return score+10 ;
     }
     else if(score==29||score==28)
         return score+9;
      else if(score==27||score==26)
         return score+8;
      else if(score==25||score==24)
         return score+7;
      else if(score==23||score==22)
         return score+6;
      else if(score==21||score==20)
         return score+5;
      else if(score==19||score==18)
         return score+4;
      else if(score==17||score==16)
         return score+3;
      else if(score==15||score==14)
         return score+2;
      else if(score==13||score==12)
         return score+1;
      else if(score==11||score==10)
         return score+0;
       else if(score==9||score==8)
         return score-1;
      else if(score==7||score==6)
         return score-2;
      else if(score==5||score==4)
         return score-3;
      else if(score==3||score==2)
         return score-4;
     else
          return score-5;
 }
       public void getRaceData(String race){
           
       if(race=="human"){
           getChar(1);
           getInte(1);
           getCon(1);
           getWis(1);
           getstrength(1);
           getDex(1);
       } 
       
       if(race=="Elf"){
        getChar(0);
           getInte(1);
           getCon(0);
           getWis(0);
           getstrength(0);
           getDex(2);
            addAbility("Darkvision:Accustomed to twilit forests and the night sky, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            addAbility("Keen Senses:You have proficiency in the Perception skill.");
            addAbility("Trance:Elves don’t need to sleep. Instead, they meditate deeply, remaining semiconscious, for 4 hours a day. (The Common word for such meditation is “trance.”) While meditating, you can dream after a fashion; such dreams are actually mental exercises that have become reflexive through years of practice. After resting in this way, you gain the same benefit that a human does from 8 hours of sleep.");
            addAbility("Fey Ancestry:You have advantage on saving throws against being charmed, and magic can’t put you to sleep.");
            addProf("Common");
            addProf("Elvish");
            addProf("Undercommon");
            addProf("Longsword ");
            addProf("Shortsword");
            addProf("Shortbow");
            addProf("Longbow");
       }
       
       if(race=="Half-Elf"){
           getChar(2);
           getInte(1);
           getCon(0);
           getWis(0);
           getstrength(0);
           getDex(1);
           addAbility("Keen Senses:You have proficiency in the Perception skill.");
          addAbility("Fey Ancestry:You have advantage on saving throws against being charmed, and magic can’t put you to sleep.");
           addAbility("Darkvision: Thanks to your elf blood, you have superior vision in dark and dim Conditions. You can see in dim light within 60 feet of you as if it were bright light, and in Darkness as if it were dim light. You can’t discern color in Darkness, only shades of gray.");
           addAbility("Skill Versiltily: You have proficiency of two skills of your choice");
           addProf("Common");
            addProf("Elvish");
            addProf("Undercommon");
            
            
       }
       
        if(race=="Dwarf"){
           getChar(0);
           getInte(0);
           getCon(0);
           getWis(2);
           getstrength(2);
           getDex(0);
       }
        
        if(race=="Dragonborn"){
        getChar(1);
           getInte(0);
           getCon(0);
           getWis(0);
           getstrength(2);
           getDex(0);
        }
        
          if(race=="Tiefling"){
           getChar(2);
           getInte(1);
           getCon(0);
           getWis(0);
           getstrength(0);
           getDex(0);
        }
       }
   
    
}
