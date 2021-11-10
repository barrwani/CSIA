import greenfoot.*; 
public class PlayButton extends Actor
{

    public void act()
    {
        if(Greenfoot.mousePressed(this)){
            Game gameplay = new Game();
            Greenfoot.setWorld(gameplay);
        }

           
    }
}
