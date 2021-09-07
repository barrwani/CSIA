import greenfoot.*; 

/**
 * Main Game Class
 * 
 * @Asaad Al-Barwani
 * @Ver 1.0
 */
public class Game extends World
{
    public Game()
    {    
        super(900, 600, 1); 
        Player p1 = new Player();
        this.addObject(p1, 100, 300);
    }
}
