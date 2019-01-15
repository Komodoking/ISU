/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ajdy5510
 */
public class Fighter extends Character {

    public Fighter(String n) {
        super(n);
    }


    protected int hpget() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    protected int acget() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    protected int racemod() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    protected int perception() {
        int perc=10;
        return perc+wis;
    }

  
    protected void magicuse() {
        int splslot=0;
        int splattack=0;
        int spldc=0;
    }

 
    protected int getmoney() {
        int money =5*(int)(Math.random()*4+1)*10;
        return money;
    }
    
}
