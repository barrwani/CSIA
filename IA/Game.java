import greenfoot.*; 

public class Game extends World
{
    private int x = 0;
    public Game()
    {   
        super(900, 600, 1); 
        Player p1 = new Player();
        this.addObject(p1, 100, 300);
        Plat2 plat = new Plat2();
        this.addObject(plat,100,340);
        Mountain mtn = new Mountain();
        this.addObject(mtn, 900, 500);
        ClearWall clr = new ClearWall();
        this.addObject(clr,0,300);
        

    }
}