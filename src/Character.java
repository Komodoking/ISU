
public abstract class Character {
   static String name;
   int pb=2;
    String feat[];
    String prof[];
    String equip[];
    String armor;
    String attacks[];
    static String backstory;
   public Character(String n){
       n=name;
       
   }
   abstract protected int hpget();
   abstract protected int acget();
   abstract protected int racemod();
   abstract protected int perception();
   abstract protected void magicuse();
   abstract protected int getmoney();
   public int getstat(int e){
       
   }
 
       
   
    
}
