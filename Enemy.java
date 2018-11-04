import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Enemy
 * 
 * @author Barry Al-Jawari, Betim Goxhuli, Edi Imamovic, James Lay 
 * 
 */
public class Enemy extends Enemies
{
    private SimpleTimer timer = new SimpleTimer();
   
    public void act() 
    {
        move(-4);
        Delete();
        fire();
        if(Greenfoot.getRandomNumber(500)>5)
        {
            turn(10); 
        }
        if(Greenfoot.getRandomNumber(500)>5)
        {
            turn(-10); 
        }
    }
   
    public void Delete()
    {
        if(atWorldEdge() && this!=null){
            World world = getWorld();
            world.removeObject(this);
        }
    } 

    public void fire() 
    {
        if (timer.millisElapsed() > 1500 && this!=null); 
        {
            if(Greenfoot.getRandomNumber(500)<2)
            {
                getWorld().addObject(new EnemyFire(getRotation()), getX(), getY());
            }
        }
    }
}
