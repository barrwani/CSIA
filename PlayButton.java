import greenfoot.*; 
public class PlayButton extends Button
{

    public void act()
    {
        if(Greenfoot.mousePressed(this)){
            ClickAnim();
            Game gameplay = new Game();
            Greenfoot.setWorld(gameplay);
        }
    }
}

