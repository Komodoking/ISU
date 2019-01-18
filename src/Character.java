
import java.util.ArrayList;


public abstract class Character {
 static String name;
 
 protected ArrayList<String> abilities;
 protected ArrayList<String> prof;
 protected ArrayList<String> skills;
 StatGetter g=new StatGetter();
 int str,dex,con,iint,wis,cha,ac,hp,perc;
  static  int pb=2;
    static String backstory;
  
   public Character(String n, String r){
    n=name;
       abilities = new ArrayList<String>();
       prof= new ArrayList<String>();
    skills=new ArrayList<String>();
       str=g.getStat();
     dex=g.getStat();
     con=g.getStat();
     iint=g.getStat();
     wis=g.getStat();
     cha=g.getStat();
     ac=0;
     hp=0;
       getRaceData(r);
   }

    public int getStr() {
        return str;
    }

    public int getDex() {
        return dex;
    }

    public int getCon() {
        return con;
    }

    public int getIint() {
        return iint;
    }

    public int getWis() {
        return wis;
    }

    public int getCha() {
        return cha;
    }

    public int getAc() {
        return ac;
    }

    public int getPerc() {
        return perc;
    }

    public int getHp() {
        return hp;
    }
   abstract protected void hpget(int c);
   abstract protected void acget(char t, int d);
   abstract protected String[] equipement(char a);
   abstract protected String attacks1(int m,int p, String attacks1);
   abstract protected String attacks2(int m,int p, String attacks1);
   abstract protected void perception(int w);
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
   
   public final void addSkill(String sk){
       skills.add(sk);
   }
   
   
   public final ArrayList<String> getSkills(){
       return skills;
   }
 public final int modgetter(int score){
     if(score==30){
         return +10 ;
     }
     else if(score==29||score==28)
         return +9;
      else if(score==27||score==26)
         return +8;
      else if(score==25||score==24)
         return +7;
      else if(score==23||score==22)
         return +6;
      else if(score==21||score==20)
         return +5;
      else if(score==19||score==18)
         return +4;
      else if(score==17||score==16)
         return +3;
      else if(score==15||score==14)
         return +2;
      else if(score==13||score==12)
         return +1;
      else if(score==11||score==10)
         return+0;
       else if(score==9||score==8)
         return -1;
      else if(score==7||score==6)
         return -2;
      else if(score==5||score==4)
         return -3;
      else if(score==3||score==2)
         return -4;
     else
          return -5;
 }
       public void getRaceData(String race){
           
       if(race=="human"){
         str++;
         dex++;
         con++;
         iint++;
         wis++;
         cha++;
       } 
       
       if(race=="Elf"){
       dex+=2;
       iint++;
            addAbility("Darkvision:Accustomed to twilit forests and the night sky, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            addAbility("Keen Senses:You have proficiency in the Perception skill.");
            addSkill("Perception");
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
          cha+=2;
          dex++;
          iint+=2;
           addAbility("Keen Senses:You have proficiency in the Perception skill.");
          addAbility("Fey Ancestry:You have advantage on saving throws against being charmed, and magic can’t put you to sleep.");
           addAbility("Darkvision: Thanks to your elf blood, you have superior vision in dark and dim Conditions. You can see in dim light within 60 feet of you as if it were bright light, and in Darkness as if it were dim light. You can’t discern color in Darkness, only shades of gray.");
           addAbility("Keen Mind: You have a mind that can track time, direction, and detail with uncanny precision. You gain the following benefits.\n" +
"\n" +
"Increase your Intelligence score by 1, to a maximum of 20.\n" +
"You always know which way is north.\n" +
"You always know the number of hours left before the next sunrise or sunset.\n" +
"You can accurately recall anything you have seen or heard within the past month.");
           addProf("Common");
            addProf("Elvish");
            addProf("Undercommon");
            
            
       }
       
        if(race=="Dwarf"){
           str+=2;
       }
        
        if(race=="Dragonborn"){
        cha++;
        str+=2;
        }
        
          if(race=="Tiefling"){
          cha+=2;
          iint++;
        }
       }
   
    
}
