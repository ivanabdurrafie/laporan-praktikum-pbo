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
public class TesterT1841720099Rafi {
    public static void main(String[] args) {
        WalkingZombie1841720099Rafi wz = new WalkingZombie1841720099Rafi(100, 1);
        JumpingZombie1841720099Rafi jz = new JumpingZombie1841720099Rafi(100, 2);
        Barrier1841720099Rafi b = new Barrier1841720099Rafi(100);
        Plant1841720099Rafi p = new Plant1841720099Rafi();
        System.out.println(wz.getZombieInfoRafi());
        System.out.println(jz.getZombieInfoRafi());
        System.out.println(b.getBarrierInfoRafi());
        System.out.println("---------------------");
        for (int i = 0; i < 4; i++) {
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
        }
        System.out.println(wz.getZombieInfoRafi());
        System.out.println(jz.getZombieInfoRafi());
        System.out.println(b.getBarrierInfoRafi());
    }
}
