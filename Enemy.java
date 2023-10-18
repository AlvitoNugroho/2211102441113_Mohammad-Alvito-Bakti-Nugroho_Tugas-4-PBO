import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Enemy extends Actor
{
public Enemy(){
        GreenfootImage image = getImage();
        image.scale(50, 30);
}
public void act() {
    checkCollision(); 
    setLocation(getX() - 1, getY());
    if(getX() <= 1){
     setLocation(getX() + 600, Greenfoot.getRandomNumber(250)+50);
    } 
    
}

    private void checkCollision() {
        Actor otherEnemy = getOneIntersectingObject(Enemy.class);
        Actor player = getOneIntersectingObject(Character.class);

        if (otherEnemy != null) {
            // Logika ketika musuh menabrak musuh lain (misalnya, musuh hancur)
            getWorld().removeObject(otherEnemy);
        }

        if (player != null) {
            // Logika ketika musuh menabrak pemain (misalnya, pemain hancur)
            Greenfoot.stop();
}
}
}
