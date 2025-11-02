package jobsheet9;

public class JumpingZombie extends Zombie {

    public JumpingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        if (health > 0) {
            switch (level) {
                case 1:
                    this.health += (this.health * 0.3); 
                    break;
                case 2:
                    this.health += (this.health * 0.4); 
                    break;
                case 3:
                    this.health += (this.health * 0.5); 
                    break;
            }
        }
    }

    @Override
    public void destroyed() {
        if (health > 0) {
            this.health -= (this.health * 0.01); 
            if (this.health <= 0) {
                this.health = 0;
                System.out.println("Jumping Zombie Kalah!");
            }
        }
    }

    @Override
    public String getZombieInfo() {
        return "Jumping Zombie Data =\n" + super.getZombieInfo();
    }
}