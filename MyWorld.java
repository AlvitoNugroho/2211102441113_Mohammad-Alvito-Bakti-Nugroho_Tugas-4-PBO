import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new Character(), 100, 300);
        addObject(new Enemy(), 300, 150);
        addObject(new Enemy(), 150, 350);
        addObject(new ObjectSpesial(), 500, 150);
        addObject(new ObjectSpesial(), 400, 90);
        addObject(new ObjectSpesial(), 200, 50);
        addObject(new ObjectSpesial(), 100, 220);
        addObject(new ObjectSpesial(), 440, 350);
        addObject(new ObjectSpesial(), 300, 150);
        addObject(new ObjectSpesial(), 600, 100);
        addObject(new ObjectSpesial(), 250, 70);
        addObject(new ObjectSpesial(), 500, 250);
        addObject(new ObjectSpesial(), 450, 200);
    }
    

    }

