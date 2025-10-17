public abstract class Zombie extends Destroyable {
    protected int health;
    protected int level;

    public Zombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public abstract void heal();
    
    
    public String getZombieInfo() {
        return "Health = " + this.health + "\nLevel = " + this.level;
    }

    public int getHealth() {
        return health;
    }
}