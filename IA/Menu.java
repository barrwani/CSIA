import greenfoot.*; 

public class Menu extends World
{

    public Menu()
    {    
        super(900, 600, 1);
        PlayButton play = new PlayButton();
        addObject(play, 450, 300);
        HowToButton howto = new HowToButton();
        addObject(howto, 450, 500);
        TitleCard title = new TitleCard();
        addObject(title, 450, 100);
    }
}
