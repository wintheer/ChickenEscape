package winther.chickenescape.framework;

import android.graphics.Bitmap;

public interface Creature {

    boolean isCreatureDead();

    int getFullHealth();

    void setFullHealth(int fullHealth);

    int getCurrentHealth();

    void setCurrentHealth(int health);

    int getHealthPercentage();

    String getName();

    void setName(String name);

    void update();

    int getSpeed();

    int getY();

    int getX();

    Bitmap getBitmap();


}
