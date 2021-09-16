import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Mountain extends Actor
{
    private int height = 0;
    private boolean up = true;
    private int amplitude = 10;
    private int period = 15;
    public void act()
    {
        if(height < period && up){
            setLocation(getX(), getY()-amplitude);
            up = true;
            height++;
        }
        if (height == (period-1))up = false;
        if (height < period && !up){
            setLocation(getX(), getY()+amplitude);
            up = false;
            height--;
        }
        if (height== -period) up = true;
        
    }
}
