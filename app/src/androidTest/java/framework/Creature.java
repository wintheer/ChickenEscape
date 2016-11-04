package framework;

public interface Creature {

    boolean isCreatureDead();

    int getFullHealth();

    int getCurrentHealth();

    void setHealth(int health);

    int getHealthPercentage();

    String getName();

    void setName(String name);

}
