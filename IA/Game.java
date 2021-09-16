import greenfoot.*; 


public class Game extends World
{
    public Game()
    {   
        super(900, 600, 1); 
        Player p1 = new Player();
        this.addObject(p1, 100, 300);
        Platform plat = new Platform();
        this.addObject(plat, 100, 400);
        AirTank tank = new AirTank();
        this.addObject(tank, 300, 200);
        Food food = new Food();
        this.addObject(food, 200,200);
        Food food2 = new Food();
        this.addObject(food2,400, 400);
        Mountain mtn = new Mountain();
        this.addObject(mtn, 500, 500);
    }
}