import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Spawns ammo, if it isn't picked up in time, it'll disappear
 * 
 * @author Barry Al-Jawari, Betim Goxhuli, Edi Imamovic, James Lay 
 * 
 */
public class AmmoPickup extends Enemies
{
    private SimpleTimer timer = new SimpleTimer();
    public void act() 
    {
        Delete();
    }    

    public void Delete(){
        Actor Player = getOneIntersectingObject(Player.class);
        World world = getWorld();
        if(this!=null){
            if(timer.millisElapsed() > 3000){

                world.removeObject(this);
              
            }
        }
    }
}
