import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Adds buttons to the About screen
 * 
 * @author Barry Al-Jawari, Betim Goxhuli, Edi Imamovic, James Lay  
 * 
 */
public class About extends World
{
    public About()
    {    
        super(1000, 500, 1); 
        addObject(new MainM(), 500, 250);
        addObject(new AboutM(), 500, 250);
        addObject(new ButtonBack(), 160, 440);
    }
}
