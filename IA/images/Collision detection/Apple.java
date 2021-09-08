import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Actor
{
    public static final GreenfootImage
    gi_sf_arr_image[]=
        {
            new GreenfootImage("apple1.png"),
            new GreenfootImage("apple2.png")
        };
    public Apple()
    {
        act();
    }

    public void act() 
    {
        setImage(gi_sf_arr_image[0]);
    }

    public void setGreenImage()
    {
        setImage(gi_sf_arr_image[1]);
    }
}