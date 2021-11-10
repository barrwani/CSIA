import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ExitButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExitButton extends Actor
{
     GreenfootImage image = getImage();

    public void act()
    {
        image.scale(50 , 25);

        if(Greenfoot.mousePressed(this)){
            //
        }
    }
}
