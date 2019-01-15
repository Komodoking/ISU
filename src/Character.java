
public abstract class Character {
 String name;
 String race;
 String abilities[];
 String attacks[];
   int pb=2;
    static String backstory;
   public Character(String n){
       n=name;
       
   }
   abstract protected int hpget();
   abstract protected int acget();
   abstract protected int perception();
   abstract protected void magicuse();
   abstract protected int getmoney();
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
       public void getRaceData(int str,int dex,int con,int INT,int wis,int cha, String race){
       if(race=="human"){

           
       } 
       
       }
   
    
}
