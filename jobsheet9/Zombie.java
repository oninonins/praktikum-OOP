package jobsheet9;

public abstract class Zombie implements Destroyable {
    protected int health;
    protected int level;

    public Zombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public void heal() {
    }
    
    @Override
    public void destroyed() {
    }

    public String getZombieInfo() {
        return "Health = " + this.health + "\nLevel = " + this.level;
    }

    public int getHealth() {
        return health;
    }
}