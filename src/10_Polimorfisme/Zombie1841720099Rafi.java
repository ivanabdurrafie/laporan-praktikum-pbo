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
public class Zombie1841720099Rafi implements IDestroyable1841720099Rafi{
    protected int health,level;
            
    public void healRafi(){
        
    };   
    
    @Override
    public void destroyedRafi() {
        
    }
    
    public String getZombieInfoRafi(){
        return "\n\tLevel  : " + level +
               "\n\tHealth : " + health;
    }
    
}
