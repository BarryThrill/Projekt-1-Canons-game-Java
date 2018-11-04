import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * When "Back" is clicked, the main menu screen appears
 * 
 * @author Barry Al-Jawari, Betim Goxhuli, Edi Imamovic, James Lay 
 * 
 */
public class ButtonBack extends Buttons
{
    public void act() 
    {
        mouseClick();
    }    
    public void mouseClick()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Meny());
        }
    }  
}
