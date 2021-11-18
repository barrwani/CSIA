import greenfoot.*; 
import java.io.*;
public class EndScreen extends World
{
    private int highscore = 0;
    private int latestscore = 0;
    private String HIGHSCOREFILEPATH ="./HighScore.TXT";  
    private String LATESTSCOREFILEPATH ="./LatestScore.TXT";

    public EndScreen()
    {   
        super(900, 600, 1);
        GameOver title = new GameOver();
        addObject(title, 450, 100);
        ExitButton exit = new ExitButton();
        addObject(exit, 450, 540);        
        PlayButton replay = new PlayButton();
        addObject(replay, 450, 400);
        ReadHighScore();
        ReadLatestScore();
        highscore *= 24.25;
        String SHmeters = Double.toString(highscore) + "m" ;
        showText("Your High Score: " + SHmeters,450, 250);
        latestscore *=24.25;
        String SLmeters = Double.toString(latestscore) + "m";
        showText("Your Score: " + SLmeters, 450, 300);
    }
    public void ReadHighScore(){
        try {
            BufferedReader br = new BufferedReader(new FileReader(HIGHSCOREFILEPATH));
            highscore = Integer.parseInt(br.readLine());
            br.close();
        }catch(Exception ex){
            return;
        }
    }
    
    public void ReadLatestScore(){
        try {
            BufferedReader br = new BufferedReader(new FileReader(LATESTSCOREFILEPATH));
            latestscore = Integer.parseInt(br.readLine());
            br.close();
        }catch(Exception ex){
            return;
        }
    }
}
