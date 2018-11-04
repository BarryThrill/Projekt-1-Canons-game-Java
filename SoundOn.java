import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * If "Sound on" is clicked, the music plays
 * 
 * @author Barry Al-Jawari, Betim Goxhuli, Edi Imamovic, James Lay 
 *
 */
public class SoundOn extends Buttons
{
    public boolean Sound;
    GreenfootSound Click = new GreenfootSound("Clicker.mp3");
    public void act() 
    {
        mouseClicked();
    }  

        public void mouseClicked()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Click.play();
            Meny.music.playLoop();
        }
    }
 }
