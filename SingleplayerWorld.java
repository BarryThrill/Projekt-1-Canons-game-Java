import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Sets background for the single player, creates enemy waves, spawns ammo and counts scored
 * 
 * @author Barry Al-Jawari, Betim Goxhuli, Edi Imamovic, James Lay 
 * 
 */
public class SingleplayerWorld extends World
{
    SoundOn soundon = new SoundOn();
    GreenfootSound booms = new GreenfootSound("boom.wav");
    private static final String bgImageName = "Background.jpg";  
    private static final double scrollSpeed = 2;  
    private static final int picWidth = (new GreenfootImage(bgImageName)).getWidth();  

    private GreenfootImage bgImage, bgBase;  
    private int scrollPosition = 0;  
    private SimpleTimer timer = new SimpleTimer();
    int Bullet=0;
    int score = 0;
    int Dead=0;
    int Enemy=0;
    Player destroyer = new Player();

    public SingleplayerWorld()
    {      
        super(1000, 500, 1);  
        setBackground(bgImageName);  
        bgImage = new GreenfootImage(getBackground());  
        bgBase = new GreenfootImage(picWidth, getHeight());  
        bgBase.drawImage(bgImage, 0, 0); 

        addObject(new Enemy(), 900, 200);
        addObject(new Enemy(), 850, 250);
        addObject(new Enemy(), 900, 300);
        
        addObject (destroyer, 100, 250);

    }  

    public void act()  
    {  
        scrollPosition -= scrollSpeed;  
        while(scrollSpeed > 0 && scrollPosition < -picWidth) scrollPosition += picWidth;  
        while(scrollSpeed < 0 && scrollPosition > 0) scrollPosition -= picWidth;  
        paint(scrollPosition);  
        spawnAtRandom();
        spawnAmmo();
        addScore();

    }  

    private void paint(int position)  
    {  
        GreenfootImage bg = getBackground();  
        bg.drawImage(bgBase, position, 0);  
        bg.drawImage(bgImage, position + picWidth, 0);  
    }  

    private void spawnAtRandom()
    {
        if (timer.millisElapsed() > 4000)
        {
            
            addObject(new AmmoPickup(), Greenfoot.getRandomNumber(55)+200, Greenfoot.getRandomNumber(500));
            addObject(new Enemy(), Greenfoot.getRandomNumber(55)+900, Greenfoot.getRandomNumber(95)+80);
            addObject(new Enemy(), Greenfoot.getRandomNumber(55)+900, Greenfoot.getRandomNumber(95)+160);
            addObject(new Enemy(), Greenfoot.getRandomNumber(55)+900, Greenfoot.getRandomNumber(95)+240);
            addObject(new Enemy(), Greenfoot.getRandomNumber(55)+900, Greenfoot.getRandomNumber(95)+320);
           
           Bullet=Bullet+1;
            timer.mark();
            
        if(score >= 50) {
                addObject(new Enemy(), Greenfoot.getRandomNumber(55)+900, Greenfoot.getRandomNumber(95)+270);
            }
        if(score >= 80) {
                addObject(new Enemy(), Greenfoot.getRandomNumber(55)+900, Greenfoot.getRandomNumber(95)+120);
            }
            if(score >= 250) {
            addObject(new Enemy(), Greenfoot.getRandomNumber(55)+900, Greenfoot.getRandomNumber(95)+90);
            addObject(new Enemy(), Greenfoot.getRandomNumber(55)+900, Greenfoot.getRandomNumber(95)+50);
            addObject(new Enemy(), Greenfoot.getRandomNumber(55)+900, Greenfoot.getRandomNumber(95)+140);
            addObject(new Enemy(), Greenfoot.getRandomNumber(55)+900, Greenfoot.getRandomNumber(95)+300);
        }
    }
}
    private void spawnAmmo()
    {
        if(Bullet>4 &&  Greenfoot.getRandomNumber(100)>1){
            addObject(new AmmoPickup(), Greenfoot.getRandomNumber(55)+500, Greenfoot.getRandomNumber(95)+250);
            Bullet=1;
        }
     
    }

    public void scoreCounter()
    {
            score=score+10;
    }

    public void addScore()
    {

        List objectslookingfor = getObjects(ThePlayer.class);
        if (objectslookingfor.size() == 0 && Dead==0) {

            Dead=1;;

        }
        if(Dead==1){
            addObject(new ScoreBoard(score), getWidth()/2, getHeight()/2);
            Dead=2;
        }

    }

}  
