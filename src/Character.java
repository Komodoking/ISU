
import java.util.ArrayList;


public abstract class Character {
 static String name;
 
 protected ArrayList<String> abilities;
 protected ArrayList<String> prof;
 protected ArrayList<String> skills;
 protected ArrayList<String> equipement;
 protected ArrayList<String> attacks;
 StatGetter f=new StatGetter();
  StatGetter a=new StatGetter();
   StatGetter b=new StatGetter();
    StatGetter c=new StatGetter();
     StatGetter d=new StatGetter();
      StatGetter e=new StatGetter();
 int str,dex,con,iint,wis,cha,ac,hp,perc,spd;
  static  int pb=2;
    static String backstory;
  
   public Character(String n, String r){
    n=name;
       abilities = new ArrayList<String>();
       prof= new ArrayList<String>();
    skills=new ArrayList<String>();
    equipement= new ArrayList<String>();
    attacks=new ArrayList<String>();
       str=a.getStat();
     dex=b.getStat();
     con=c.getStat();
     iint=d.getStat();
     wis=e.getStat();
     cha=f.getStat();
     ac=acget('a', dex);
     hp=hpget(modgetter(con));
     perc=perception(wis);
     spd=getSpd();
       getRaceData(r);
   }

    public void setStr(int str) {
        this.str = str;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public void setCon(int con) {
        this.con = con;
    }

    public void setIint(int iint) {
        this.iint = iint;
    }

    public void setWis(int wis) {
        this.wis = wis;
    }

    public void setCha(int cha) {
        this.cha = cha;
    }
   
   

    public int getSpd() {
        return spd;
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
   abstract protected int hpget(int c);
   abstract protected int acget(char t, int d);
   abstract protected void equipement(char a);
   abstract  protected void proficiencies();
   abstract protected void attacks(int m,int p,char a);
   abstract protected void abilities();
   abstract protected int perception(int w);
   abstract protected int getmoney();
   
    public final void addEquip(String eq){
         equipement.add(eq);
   }
   
   
   public final ArrayList<String> getEquip(){
       return  equipement;
   } public final void addAttack(String at){
         attacks.add(at);
   }
   
   
   public final ArrayList<String> getattack(){
       return  attacks;
   }
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
           addProf("Common");
           addProf("Elvish");
           spd=30;
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
            spd=30;
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
            spd=30;
            
       }
       
        if(race=="Dwarf"){
           str+=2;
           con+=2;
            addProf("Battleaxe");
            addProf("Handaxe");
            addProf("Light Hammer");
            addProf("Warhammer");
            addProf("Common");
            addProf("Dwarvish");
            addAbility("Dwarvern Resilience:You have advantage on saving throws against poison, and you have resistance against poison damage");
            addAbility("Darkvision:Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            addAbility("Stonecunning:Whenever you make an Intelligence (History) check related to the origin of stonework, you are considered proficient in the History skill and add double your proficiency bonus to the check, instead of your normal proficiency bonus.");
            spd=25;
       }
        
        if(race=="Aarakocra"){
        wis++;
        dex+=2;
        spd=25;
            addProf("Common");
            addProf("Aarakocra");
            addProf("Auran");
            addAbility("Flight:You have a flying speed of 50 feet. To use this speed, you can’t be wearing medium or heavy armor.");
            addAbility("You are proficient with your unarmed strikes, which deal 1d4 slashing damage on a hit.");
        }
        
          if(race=="Tiefling"){
          cha+=2;
          iint++;
          spd=30;
              addProf("Common");
              addProf("Infernal");
              addAbility("Hellish resistance: You have resistance to fire damage.");
              addAbility("Darkvision:Thanks to your infernal heritage, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
              addAbility("Infernal Legacy:You know the thaumaturgy cantrip. When you reach 3rd level, you can cast the hellish rebuke spell as a 2nd-level spell once with this trait and regain the ability to do so when you finish a long rest. When you reach 5th level, you can cast the darkness spell once with this trait and regain the ability to do so when you finish a long rest. Charisma is your spellcasting ability for these spells.");
        }
       }
   
    
}
