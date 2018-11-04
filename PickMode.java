import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Add buttons to the pick mode screen
 * 
 * @author Barry Al-Jawari, Betim Goxhuli, Edi Imamovic, James Lay 
 * 
 */
public class PickMode extends World
{

    public PickMode()
    {    
        super(1000, 500, 1); 
        addObject(new MainM(), 500, 250);
        addObject(new Singleplayer(), 505, 240);
        addObject(new ButtonBack(), 160, 440);
    }
}
