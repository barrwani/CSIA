import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Toucher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Toucher extends Collision
{
    /**
     * Act - do whatever the Toucher wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Toucher()
    {
        setImage("alligator.png");
    }

    public void act() 
    {
        turn(1);
        List<Apple> list_apple_=getTouchedObjects(Apple.class);
        for(Apple apple_:list_apple_)
            apple_.setGreenImage();
    }    
}
