import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Allows the player to move and fire bullet
 * 
 * @author Barry Al-Jawari, Betim Goxhuli, Edi Imamovic, James Lay 
 * 
 */

public class Player extends ThePlayer
{
    int ammoBullets=10;
    
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    private GreenfootImage image4;

    private SimpleTimer timer = new SimpleTimer();
    
    public void checkCollision()
    {
        Actor EnemyClass = getOneIntersectingObject(Enemy.class);
        Actor AmmoClass = getOneIntersectingObject(AmmoPickup.class);
        World world = getWorld();
        if (AmmoClass != null)
        {
            world.removeObject(AmmoClass);
            ammoBullets=ammoBullets+5;
            world.removeObject(AmmoClass);
        }

        if ( EnemyClass  != null)
        {
            world.addObject(new Boom(), getX(), getY());
            world.removeObject(this);
            world.removeObject( EnemyClass );
            world.addObject(new ButtonBack(), 100, 100);

        }
    }

    public void act() 
    {
        checkCollision();
        steering();
        fire();
      
    }    

    public void steering()
    {
            int dx = 0; 
            int dy = 0; 
            if (Greenfoot.isKeyDown("W"))   
            {
                setRotation(270);
                move(4);
            }
            if (Greenfoot.isKeyDown("S")){    
                setRotation(90);
                move(4);            
            }
            if(Greenfoot.isKeyDown("A")){  
               
                setRotation(180);
                dx--; 
                move(4);
            }
            if (Greenfoot.isKeyDown("D")){
                
                setRotation(0);
                dx++; 
                move(4);
            }
        if(getRotation()>0){
            {
                setRotation(0);
            }
        }
    }

    public void fire() 
    {
        if ( ammoBullets>0 && timer.millisElapsed() > 500 && Greenfoot.isKeyDown("space")) 
        {
            ammoBullets--;
            getWorld().addObject(new Bullet(getRotation()), getX(), getY());
            timer.mark();
           
        }
    }
}
