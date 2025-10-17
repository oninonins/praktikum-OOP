public class WalkingZombie extends Zombie {

    public WalkingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        if (health > 0) {
            switch (level) {
                case 1:
                    this.health += (this.health * 0.2); 
                    break;
                case 2:
                    this.health += (this.health * 0.3); 
                    break;
                case 3:
                    this.health += (this.health * 0.4); 
                    break;
            }
        }
    }

    @Override
    public void destroyed() {
        if (this.health > 0) {
            this.health -= (this.health * 0.2); // Berkurang 20%
            if (this.health <= 0) {
                this.health = 0;
                System.out.println("Walking Zombie Kalah!");
            }
        }
    }

    @Override
    public String getZombieInfo() {
        return "Walking Zombie Data =\n" + super.getZombieInfo();
    }
}