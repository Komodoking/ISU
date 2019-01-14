
import java.util.stream.IntStream;


public class StatGetter {
int dice[]= new int[4];
int stat;
    public StatGetter(){
        for (int i = 0; i < dice.length; i++) {
            dice[i]=(int)(Math.random()*6+1);
           
        }
        
       
    }
    public static int getMinValue(int[] dice){
  int minValue = dice[0];
  for(int i=1;i<dice.length;i++){
    if(dice[i] < minValue){
	  minValue = dice[i];
	}
  }
  return minValue;
}
    public int getStat(int racemod){
        int g=getMinValue(dice);
         int sum= IntStream.of(dice).sum();
         return sum-g+racemod;
         
    }
}
