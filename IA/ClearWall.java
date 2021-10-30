import greenfoot.*;
public class ClearWall extends Actor
{

    public void act()
    {
        if (isTouching(MountWall.class)){
            removeTouching(MountWall.class);
        }
        if (isTouching(Platform.class)){
            removeTouching(Platform.class);
        }
    }
}
