import greenfoot.*; 

public class Mountain extends Actor
{
    private boolean up = true;
    private boolean spawned = false;
    private boolean reduceMount = false;
    private int heightMIN = 590;
    private int currentMAX = 300;
    private int heightMAX = 200;
    private int steepness = 20;
    private int sidedepth = 10;
    public int speed = -4;
    public void act()
    {
        MountWall mtwall = new MountWall();
        getWorld().addObject(mtwall, getX(), getY());
        
        ///Spawns pickup items every 5 mountain cycles
        if(((Game)getWorld()).points % 5 ==0 && ((Game)getWorld()).points != 0 && ! spawned){
            ((Game)getWorld()).spawnPickups(currentMAX-50);
            spawned = true;
        }
        
        ///Catches pickup spawns to ensure only one pair is spawned
        if(((Game)getWorld()).points % 5 != 0)spawned = false;
        
        ///Increases speed every 10 cycles
        if(((Game)getWorld()).points % 10 != 0)speed -=1;
        
        ///Moves mountain up and down based on current direction and limits
        if(up && getY() > currentMAX)setLocation(getX(),getY()-sidedepth);
        if(!up && getY() < heightMIN)setLocation(getX(),getY()+sidedepth);
        
        if(!up && getY() == heightMIN){
            
            ///If the mountain reaches the minimum point while going downwards
            ///We change the difficulty based on past conditions and make the mountain go up
            if(currentMAX> heightMAX && !reduceMount)currentMAX -= steepness;
            else if(currentMAX == heightMAX)reduceMount= true;
            if(reduceMount)currentMAX +=steepness;
            if(currentMAX == 300)reduceMount = false;
            up = true;
        }
        
        if(getY() == currentMAX){
            ///Platform Spawns when mountain reaches peak
            up = false;
            ((Game)getWorld()).points++;
            Platform plt = new Platform();
            getWorld().addObject(plt,getX(), getY()-15);
        }
    }
}
