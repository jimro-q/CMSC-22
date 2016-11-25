
package lab14;

public class Lab14 {

    public static void main(String[] args) {
        Character c = new King(new KnifeBehavior());
        
        c.fight();
        
        Character e = new Queen(new BowAndArrowBehavior());
        
        e.fight();
        
        Character f = new Knight(new SwordBehavior());
        
        f.fight();
        
        Character g = new Troll(new AxeBehavior());
        
        g.fight();
        
        c.setWeapon(new AxeBehavior());
        
        c.fight();
    }
    
}
