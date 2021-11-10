import greenfoot.*;
public class ExitButton extends Actor
{
    GreenfootImage image = getImage();

    public void act()
    {

    if(Greenfoot.mousePressed(this)){
        Menu main = new Menu();
        Greenfoot.setWorld(main);
        }
    }
}
