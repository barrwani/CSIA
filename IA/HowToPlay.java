import greenfoot.*; 

public class HowToPlay extends World
{

    public HowToPlay()
    {    
        super(900, 600, 1);
        Tutorial tut = new Tutorial();
        addObject(tut,450,300);
        ExitButton exit = new ExitButton();
        addObject(exit, 450, 500);
    }
}
