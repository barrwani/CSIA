import greenfoot.*;  

public class Player extends Actor
{
    private boolean jumping;
    private int jumpHeight = 15;
    private int speed = 4;
    private int accel = 1;
    private boolean pressed = false;
    private int velocity = 0;
    private boolean airjump = false;
    private int gravity = 5;
    public int score = 0;
    public int start = 0;
    public int end = 0;
    public int length = 0;
    public int[] arr = new int[10];
    public boolean alive = true;
    public int direction = 1;

    public void act()
    {
        //Basic Player Jump + Gravity provided by danpost
        
        if(alive){
            checkInput();
        }
  
        checkFall();
        checkPickup();
        checkDeath();
        
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
        if(Greenfoot.isKeyDown("e") && !pressed){
            pressed = true;
            powerQ();
        }
        if (!Greenfoot.isKeyDown("e") && pressed){
            pressed = false;
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
          speed = 4;
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
            if(!isFull())q(1);
            removeTouching(AirTank.class);
        }
        if(isTouching(Food.class)){
            if(!isFull())q(2);
            removeTouching(Food.class);
        }
    }
    public void powerQ()
    {
        if(!isEmpty()){
            switch (arr[start]){
                case 1:
                    airjump = true;
                    dq();
                    break;
                case 2:
                    speed = 8;
                    dq();
                    break;
            }
        }
    }
      public void q(int i){
        arr[end] = i;
        end++;
        length++;
    }
    public void dq(){
        arr[start] = 0;
        length--;
        start++;
    }
    public boolean isEmpty() {
        if(start == end && length == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isFull() {
        if(start == end && length != 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public void checkDeath(){
        if(isTouching(MountWall.class)){
            ((Game)getWorld()).GameOver();
            alive = false;
        }
    }
}
