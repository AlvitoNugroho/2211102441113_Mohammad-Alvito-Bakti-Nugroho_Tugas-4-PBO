import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

public class ObjectSpesial extends Actor
{
    public ObjectSpesial(){
        GreenfootImage image = getImage();
        image.scale(20, 20);
    }
    
    public void act()
    {
       checkForCollision(); 
    }
    
    public void checkForCollision() {
        Character character = (Character) getOneIntersectingObject(Character.class);
        if (character != null) {
            character.increaseScore();
            getWorld().removeObject(this);
        }
    }
}
