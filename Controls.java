import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Adds buttons to the Controls screen
 * 
 * @author Barry Al-Jawari, Betim Goxhuli, Edi Imamovic, James Lay  
 *
 */
public class Controls extends World
{
    public Controls()
    {    
        super(1000, 500, 1);
        addObject(new ControlsM(), 500, 250);
        addObject(new ButtonBack(), 160, 440);
    }
}
