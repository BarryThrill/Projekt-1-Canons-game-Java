import greenfoot.*;  

/**
 * Enemies' bullet
 * 
 * @author Barry Al-Jawari, Betim Goxhuli, Edi Imamovic, James Lay 
 */
public class EnemyFire extends Enemies
{
    private int direction, speed;
    
    public EnemyFire(int dir)
    {
        direction = dir;
        speed = -15;
    }

    public void act()
    {
        setRotation(direction);
        move(speed);
        checkCollision();
    }

    public void Remove()
    {
        if(atWorldEdge() && this!=null){
            World world = getWorld();
            world.removeObject(this);
        }
    } 

    private void checkCollision()
    {
        Actor Player = getOneIntersectingObject(Player.class);
        if(atWorldEdge()){
            World world = getWorld();
            world.removeObject(this);
        }
        else if (Player !=null && this!=null)
        {
            World world = getWorld();
            world.addObject(new Boom(), getX(), getY());
            world.addObject(new ButtonBack(), 100, 100);
            world.removeObject(this);
            world.removeObject(Player);
        }
    }
}