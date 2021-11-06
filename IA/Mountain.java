import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Mountain extends Actor
{
    private int height = 0;
    private boolean up = true;
    private int amplitude = 10;
    private boolean lower = false;
    private int period = 15;
    public static int points = 0;
    public void act()
    {
        MountWall mtwall = new MountWall();
        getWorld().addObject(mtwall, getX(), getY());
        
        if(height < period && up){
            setLocation(getX(), getY()-amplitude);
            up = true;
            height++;
        }
        if (height == ((period)-1)){
            if (period < 21 ){
                period++;
            }

            up = false;
            points++;
            Platform plt = new Platform();
            getWorld().addObject(plt,getX(), getY()-5);
        }
        if (height < period && !up){
            setLocation(getX(), getY()+amplitude);
            up = false;
            height--;
        }
        if (height== -period)up = true;
        
    }
}
