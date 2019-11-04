/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author Ivan Abdurrafie
 */
public class Barrier1841720099Rafi implements IDestroyable1841720099Rafi{
    private int strength;

    public Barrier1841720099Rafi(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
    
    public String getBarrierInfoRafi(){
        return  "Barrier Strength = "+ getStrength()+" \n";
    }

    @Override
    public void destroyedRafi() {
        this.strength -= this.strength * 11/100;
    }
}
