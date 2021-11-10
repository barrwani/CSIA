import greenfoot.*; 
import java.io.*;
public class EndScreen extends World
{
    private int highscore = 0;

    public EndScreen()
    {   
        super(900, 600, 1);
        GameOver title = new GameOver();
        addObject(title, 450, 100);
        ExitButton eb = new ExitButton();
        addObject(eb, 450, 540);        
        PlayButton replay = new PlayButton();
        addObject(replay, 450, 400);
    }
}
