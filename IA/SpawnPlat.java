import greenfoot.*;

public class SpawnPlat extends Platform
{

    int jumpsLeft = 0;
    public void act()
    {
        // Greenfoot doesn't have perfect collisions
        // The player will touch the plat and stop touching constantly
        // So the solution is to reset our jumpsleft every time it touches
        if(! isTouching(Player.class)){
            jumpsLeft++;
        }
        else if(isTouching(Player.class)){
            jumpsLeft = 0;
        }
        if(jumpsLeft == 10){
            getWorld().removeObject(this);
        }
    }
}
