import greenfoot.*; 
import java.io.*;
import java.util.Random;


public class Game extends World
{
    private double meters = 0;
    public int points = 0;
    public int highscore = 0;
    private String HIGHSCOREFILEPATH ="./HighScore.TXT";
    private String LATESTSCOREFILEPATH ="./LatestScore.TXT";

    public Game()
    {   
        super(900, 600, 1); 
        Player player = new Player();
        addObject(player, 100, 300);
        SpawnPlat plat = new SpawnPlat();
        addObject(plat,100,340);
        Mountain mtn = new Mountain();
        addObject(mtn, 900, 500);
        ClearWall clrwall = new ClearWall();
        addObject(clrwall,0,300);
        ClearFloor cfloor = new ClearFloor();
        addObject(cfloor,450, 590);
    }
    
    public void act(){
        meters = 24.25 * points;
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
        ReadHighScore();
        if(points > highscore){
            WriteHighScore();
        }
        WriteLatestScore();
        EndScreen endscreen = new EndScreen();
        Greenfoot.setWorld(endscreen);
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
    public void WriteHighScore(){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(HIGHSCOREFILEPATH));
            bw.write(Integer.toString(points));
            bw.close();
        }catch(Exception ex){
            return;
        }
    }

    public void WriteLatestScore(){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(LATESTSCOREFILEPATH));
            bw.write(Integer.toString(points));
            bw.close();
        }catch(Exception ex){
            return;
        }
    }
    

}