import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * When "Sound off" is clicked, the music stops playing
 * 
 * @author Barry Al-Jawari, Betim Goxhuli, Edi Imamovic, James Lay 
 * 
 */
public class SoundOff extends Buttons
{
    public int getVolume=0;
    SoundOn soundon = new SoundOn();
    
    GreenfootSound music = new GreenfootSound("Meny.wav");
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
            Meny.music.pause();
        }
          
    }
}

