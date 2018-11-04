import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * When "are you ready?" is clicked, the single player game starts
 * 
 * @author Barry Al-Jawari, Betim Goxhuli, Edi Imamovic, James Lay 
 * 
 */
public class Singleplayer extends Buttons
{
    public void act() 
    {
        mouseClick();
    }    

    public void mouseClick()
    {
        if(Greenfoot.mouseClicked(this))
        {
            World world = getWorld();
            Greenfoot.setWorld(new SingleplayerWorld());
            Meny.music.stop();
        }
    }
}
