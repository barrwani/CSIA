import greenfoot.*;  
public class HowToButton extends Button
{

    public void act()
    {
        if(Greenfoot.mousePressed(this)){
            ClickAnim();
            HowToPlay howto = new HowToPlay();
            Greenfoot.setWorld(howto);
        }
    }
}

