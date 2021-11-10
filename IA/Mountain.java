import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Mountain extends Actor
{
    private boolean up = true;
    private boolean reduceMount = false;
    private int heightMIN = 590;
    private int currentMAX = 300;
    private int heightMAX = 200;
    private int steepness = 20;
    public static int points = 0;
    public void act()
    {
        MountWall mtwall = new MountWall();
        getWorld().addObject(mtwall, getX(), getY());
        
        if(up && getY() > currentMAX){
            setLocation(getX(),getY()-10);
        }
        
        if(!up && getY() < heightMIN){
            setLocation(getX(),getY()+10);
        }
        
        if(!up && getY() == heightMIN){
            
            if(currentMAX> heightMAX && !reduceMount)currentMAX -= steepness;
            else if(currentMAX == heightMAX)reduceMount= true;
            
            if(reduceMount)currentMAX +=steepness;
            
            if(currentMAX == 300)reduceMount = false;
            
            up = true;
        }
        
        if(getY() == currentMAX){
            up = false;
            points++;
            Platform plt = new Platform();
            getWorld().addObject(plt,getX(), getY()-10);
        }
    }
}
