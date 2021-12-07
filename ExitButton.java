import greenfoot.*;
public class ExitButton extends Button
{
    GreenfootImage image = getImage();

    public void act()
    {

    if(Greenfoot.mousePressed(this)){
        ClickAnim();
        Menu main = new Menu();
        Greenfoot.setWorld(main);
        }
    }
}
