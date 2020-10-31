package src.Project.tilegame.display;

public class Weapon {
    private String name;
    private double damage;
    private int range;

    public Weapon(String Name, double damage, int range){
        this.name = Name;
        this.damage = damage;
        this.range = range;
    }

    public double getDamage() {
        return damage;
    }

    public int getRange() {
        return range;
    }

    public String getName() {
        return name;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public void setRange(int range) {
        this.range = range;
    }

    /*public void attack(){
        #TODO: Figure out how targeting is gonna work
    }*/

}
