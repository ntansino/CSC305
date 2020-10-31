package src.Project.tilegame.display;

public class Player extends Character{

    private int health;
    private double speed;
    private double dmgBonus;
    private Weapon weapon;

    public Player(int health, double speed, double dmgBonus, Weapon weapon){
        this.health = health;
        this.speed = speed;
        this.dmgBonus = dmgBonus;
        this.weapon = weapon;
    }

    public Player(){
        this.health = 100;
        this.speed = 1;
        this.dmgBonus = 1;
        this.weapon = new Weapon("Excalibur", 10, 1);
    }

    public int getHealth() {
        return health;
    }

    public double getSpeed() {
        return speed;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void getHurt(double dmg){
        this.health -=  dmg;
    }

    public double getDmgBonus() {
        return dmgBonus;
    }

    public void setDmgBonus(double dmgBonus) {
        this.dmgBonus = dmgBonus;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void printWeapon(){
        System.out.println("Weapon: " + weapon.getName());
        System.out.println("Damage: " + weapon.getDamage());
        System.out.println("Range: " + weapon.getRange() + '\n');
    }
}
