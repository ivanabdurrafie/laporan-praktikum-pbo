/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1841720099Rafi;

/**
 *
 * @author Ivan Abdurrafie
 */
public class Ikan1841720099Rafi {

    public void swim() {
        System.out.println("Ikan bisa Berenang");
    }
    public static void main(String[] args) {
        Ikan1841720099Rafi a = new Ikan1841720099Rafi();
        Ikan1841720099Rafi b = new Piranha1841720099Rafi();
        a.swim();
        b.swim();
    }
}

class Piranha1841720099Rafi extends Ikan1841720099Rafi{
    public void swim(){
        System.out.println("Piranha bisa Makan Daging");
    }
}

