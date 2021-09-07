import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Player extends Actor
{
    private boolean jumping;
    private int jumpHeight = 10;
    private int speed = 5;
    private int accel = 1;
    public int score = 0;
    public int direction = 1;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //pass
    }
    public void checkInput(){
        if(Greenfoot.isKeyDown("left")){
            direction = 1;
            Left();
        }
        else if (Greenfoot.isKeyDown("right")){
            direction = -1;
            Right();
        }
    }
    public void Right(){
        setLocation(getX()+speed, getY());
    }
    public void Left(){
        setLocation(getX()-speed, getY());
    }
    public boolean isOnFloor(){
        if(!isTouching(Platform.class)){
            applyGravity();
            return false;
        }
        else return true;
    }
    public void applyGravity(){
        //pass
    }
}
