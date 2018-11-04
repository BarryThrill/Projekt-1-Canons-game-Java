import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * When "Controls" is clicked, the "Controls" screen appears and a sound is played
 *
 * @author Barry Al-Jawari, Betim Goxhuli, Edi Imamovic, James Lay 
 * 
 */
public class ButtonControls extends Buttons
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
            World world = getWorld();
            Greenfoot.setWorld(new Controls());
            Click.play();
        }
    }   
}
