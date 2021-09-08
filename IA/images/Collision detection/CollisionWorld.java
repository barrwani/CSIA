import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CollisionWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CollisionWorld extends World
{

    /**
     * Constructor for objects of class CollisionWorld.
     * 
     */
    public CollisionWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(300, 300, 1); 
        for(int x=50;x<getWidth();x+=50)
            for(int y=50;y<getHeight();y+=50)
                addObject(new Apple(),x,y);
        addObject(new Toucher(),getWidth()/2,getHeight()/2);
    }
}
