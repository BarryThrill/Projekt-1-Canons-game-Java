import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * When "Start Game" is clicked, PickMode screen appears and a sound is played
 * 
 * @author Barry Al-Jawari, Betim Goxhuli, Edi Imamovic, James Lay 
 * 
 */

public class ButtonStart extends Buttons
{
    public void act() 
    {
        mouseClick();
    }    
    GreenfootSound Click = new GreenfootSound("Clicker.mp3");
    public void mouseClick()
    {
        if(Greenfoot.mouseClicked(this))
        {
            World world = getWorld();
            Greenfoot.setWorld(new PickMode());
            Click.play();
            
        }
    }
}
