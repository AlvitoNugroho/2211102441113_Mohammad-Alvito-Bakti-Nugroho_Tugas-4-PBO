import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.concurrent.Phaser;

/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character extends Actor
{
    private int score = 0;
    int dx = 0;
    int dy = 0;
    
    public Character(){
        GreenfootImage image = getImage();
        image.scale(80, 60);
    }
    
    public void act()
    {
    String key = Greenfoot.getKey();
    if (key != null) {
        if (Greenfoot.isKeyDown("up")) {
            dy = -2;
        } else if (Greenfoot.isKeyDown("down")) {
            dy = 2;
        } else if (Greenfoot.isKeyDown("left")) {
            dx = -2;
        } else if (Greenfoot.isKeyDown("right")) {
            dx = 2;
        }
    }
    
    setLocation(getX() + dx, getY() + dy);
    }
    
    public void checkForCollision() {
        Actor object = getOneIntersectingObject(ObjectSpesial.class);
        if (object != null) {
            increaseScore();
            getWorld().removeObject(object);
        }
        
        Actor enemy = getOneIntersectingObject(Enemy.class);
        if (enemy != null) {
            Greenfoot.stop(); 
    }
}
        
public void increaseScore() {
        score += 10;
        getWorld().showText("Score: "+ score, 50, 25);
    }
}

