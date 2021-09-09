import greenfoot.*;  

public class Player extends Actor
{
    private boolean jumping;
    private int jumpHeight = 15;
    private int speed = 5;
    private int accel = 1;
    private int velocity = 0;
    private boolean airjump = false;
    private int gravity = 5;
    public int score = 0;
    public static boolean alive = true;
    public int direction = 1;

    public void act()
    {
        //Player Jump + Gravity provided by danpost
        checkInput();
        checkFall();
        checkPickup();
    }
    public void checkInput()
    {
        if(Greenfoot.isKeyDown("left")){
            direction = 1;
            Left();
        }
        else if (Greenfoot.isKeyDown("right")){
            direction = -1;
            Right();
        }
        if(Greenfoot.isKeyDown("space") && !jumping){
            jump();
        }
    }
    public void Right()
    {
        setLocation(getX()+speed, getY());
    }
    public void Left()
    {
        setLocation(getX()-speed, getY());
    }
    public boolean isOnFloor()
    {
        int spriteHeight = getImage().getHeight();
        int yDistance = (int)(spriteHeight/2) + 5;
        Actor ground = getOneObjectAtOffset(0, getImage().getHeight()/2, Platform.class);
        if(ground == null)
        {
            jumping = true;
            return false;
        }
        else
        {
            applyGravity(ground);
            return true;
        }
    }
    public void applyGravity(Actor ground)
    {
        int groundHeight = ground.getImage().getHeight();
        int newY = ground.getY() - (groundHeight + getImage().getHeight())/2;
        setLocation(getX(), newY);
        jumping = false;
    }
    public void checkFall()
    {
        if(isOnFloor())
        {
            velocity = 0;
        }
        else
        {
            fall();
        }
    }

    public void jump()
    {
        if(!airjump)velocity = velocity - jumpHeight;
        else{
          velocity = velocity - 20;
          airjump = false;
        }
        jumping = true;
        fall();
    }
    public void fall()
    {
        setLocation(getX(), getY() + velocity);
        if(velocity <=9)
        {
            velocity = velocity + accel;
        }
        jumping = true;
    }
    public void checkPickup()
    {
        if (isTouching(AirTank.class)){
            airjump = true;
            removeTouching(AirTank.class);
        }
    }
    public void powerQ()
    {
        //
    }
}
