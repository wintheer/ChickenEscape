package standard;

import framework.Creature;

/**
 * Created by Winther on 04/11/2016.
 */

public class Player implements Creature {
    private int currentHealth;
    private int fullHealth;
    private String name;

    @Override
    public boolean isCreatureDead() {
        if (this.currentHealth <= 0) {
            return true;
        }
        return false;
    }

    @Override
    public int getFullHealth() {
        return this.fullHealth;
    }

    @Override
    public int getCurrentHealth() {
        return currentHealth;
    }

    @Override
    public void setHealth(int health) {
        this.currentHealth = health;
    }

    @Override
    public int getHealthPercentage() {
        return (currentHealth * 100) / fullHealth;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
