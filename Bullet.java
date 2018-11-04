import greenfoot.*;  


/**
 * Player's bullet
 * 
 * @author Barry Al-Jawari, Betim Goxhuli, Edi Imamovic, James Lay 
 */

public class Bullet extends Enemies
{
    private int direction, speed;
    private SimpleTimer timer = new SimpleTimer();
    public Bullet(int dir)
    {
        direction = dir;
        speed = 15;
    }

    public void act()
    {
        setRotation(direction);
        move(speed);
        checkCollision();
    }

    private void checkCollision()
    {
        Actor Enemy = getOneIntersectingObject(Enemy.class);
        Actor EnemyFire = getOneIntersectingObject(EnemyFire.class);

        if(atWorldEdge() && timer.millisElapsed()>600){
            World world = getWorld();
            world.removeObject(this);
        }

        if (Enemy !=null)
        {
            SingleplayerWorld Singleworld = (SingleplayerWorld) getWorld();
            Singleworld.scoreCounter();
            World world = getWorld();
            world.addObject(new Boom(), getX(), getY());
            world.removeObject(this);
            world.removeObject(Enemy);
        }

        if (EnemyFire !=null && this!=null)
        {
            World world = getWorld();
            world.addObject(new Boom(), getX(), getY());
            world.removeObject(this);
            world.removeObject(EnemyFire);

        }
    }
}