import greenfoot.*;  
public class HowToButton extends Actor
{

    public void act()
    {
        if(Greenfoot.mousePressed(this)){
            HowToPlay howto = new HowToPlay();
            Greenfoot.setWorld(howto);
        }
    }
}
