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
    }
}