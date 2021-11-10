import greenfoot.*; 
public class EndScreen extends World
{


    public EndScreen()
    {    
        super(900, 600, 1);
        ExitButton eb = new ExitButton();
        addObject(eb, 450, 500);
        
    }
}
