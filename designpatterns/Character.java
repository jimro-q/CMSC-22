
package lab14;

public abstract class Character {
    public WeaponBehavior w;
    
    Character(WeaponBehavior w){
        this.w = w;
    }
    
    public void setWeapon(WeaponBehavior w){
        this.w = w;
    }
    
    public void fight(){
        w.useWeapon();
    }
}
