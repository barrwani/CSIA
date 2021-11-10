import greenfoot.*; 
import java.io.*;
import java.util.Random;

public class Game extends World
{
    private int x = 0;
    private double meters = 0;
    public int points = 0;
    public Game()
    {   
        super(900, 600, 1); 
        Player p1 = new Player();
        addObject(p1, 100, 300);
        Plat2 plat = new Plat2();
        addObject(plat,100,340);
        Mountain mtn = new Mountain();
        addObject(mtn, 900, 500);
        ClearWall clr = new ClearWall();
        addObject(clr,0,300);
        ClearFloor cflr = new ClearFloor();
        addObject(cflr,450, 590);
    }
    
    public void act(){
        meters = 48.5 * points;
        String Smeters = Double.toString(meters) + "m" ;
        showText(Smeters, 450, 100);
    }
    
    public void spawnPickups(int ylimits){
        Random rand = new Random();
        int balloonposX = rand.nextInt(800) + 100;
        int balloonposY = rand.nextInt(300);
        AirTank bal = new AirTank();
        addObject(bal, balloonposX, balloonposY);
        
        int foodposX = rand.nextInt(800) + 100;
        int foodposY = rand.nextInt(300);
        Food food = new Food();
        addObject(food, foodposX, foodposY);
        
    }
    
    public void GameOver(){
        EndScreen w = new EndScreen();
        Greenfoot.setWorld(w);
    }
}