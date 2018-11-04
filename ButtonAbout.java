import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * When "About" is clicked, the "About" screen appears and a sound is played
 * 
 * @author Barry Al-Jawari, Betim Goxhuli, Edi Imamovic, James Lay 
 * 
 */


public class ButtonAbout extends Buttons
{
     GreenfootSound Click = new GreenfootSound("Clicker.mp3");
    public void act() 
    {
        
        mouseClick();
        
    }

    public void mouseClick()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Click.play();
            World world = getWorld();
            Greenfoot.setWorld(new About());
        }
    }
}
