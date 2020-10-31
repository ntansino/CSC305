package src.Project.tilegame.display;

public class Character {

    private int health;
    private double speed;
    private Weapon weapon;

    public Character(int health, double speed, double dmgBonus){
        this.health = health;
        this.speed = speed;
    }

    public Character(){
        this.health = 100;
        this.speed = 1;
    }
}
