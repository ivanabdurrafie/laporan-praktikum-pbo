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
public class WalkingZombie1841720099Rafi extends Zombie1841720099Rafi{

    public WalkingZombie1841720099Rafi(int health, int level) {
    }

    @Override
    public String getZombieInfoRafi() {
        return "Walking Zombie Data = \n"+super.getZombieInfoRafi();
    }

    @Override
    public void destroyedRafi() {
        this.health -= this.health * 20 / 100;
    }

    @Override
    public void healRafi() {
        switch(this.level){
            case 1:{
                this.health += this.health * 20 / 100;
                break;
            }
            
            case 2:{
                this.health += this.health * 30 / 100;
                break;
            }
            
            case 3:{
                this.health += this.health * 40 / 100;
                break;
            }
        }
    }
    
}
