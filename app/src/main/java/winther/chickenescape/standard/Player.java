package winther.chickenescape.standard;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import winther.chickenescape.R;
import winther.chickenescape.framework.Creature;

/**
 * Created by Winther on 04/11/2016.
 */

public class Player implements Creature {
    private int currentHealth;
    private int fullHealth;
    private String name;

    private Bitmap bitmap;

    // Coordinates
    private int x, y;
    // Speed of player
    private int speed = 0;

    public Player(Context context) {

        //Tilfældige numre er valgt her
        x = 69;
        y = 45;
        speed = 2;


        //TODO tegn en lille figur til dette og brug fra R.drawable.player
        bitmap = BitmapFactory.decodeResource(context.getResources(), R.mipmap.ic_launcher);
    }



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
    public void setFullHealth(int fullHealth) {
        this.fullHealth = fullHealth;
    }

    @Override
    public int getCurrentHealth() {
        return currentHealth;
    }

    @Override
    public void setCurrentHealth(int health) {
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

    @Override
    public void update() {

        //TODO find ud af hvordan input skal håndteres og hvordan player skal flytte sig (op/ned + højre/venstre)
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public Bitmap getBitmap() {
        return bitmap;
    }
}
