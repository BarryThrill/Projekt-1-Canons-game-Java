import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Adds buttons to the Main Menu screen
 * 
 * @author Barry Al-Jawari, Betim Goxhuli, Edi Imamovic, James Lay 
 * 
 */
public class Meny extends World
{
    
    public static GreenfootSound music;
    {
    if(music == null)
    {
        music = new GreenfootSound("Meny.wav");
        music.playLoop();
    }
}
    public Meny()
    {    
        super(1000, 500, 1); 
        
        addObject(new MainM(), 500, 250);
       
        addObject(new ButtonStart(), 500, 240);
        addObject(new ButtonControls(), 360, 350);
        addObject(new ButtonAbout(), 675, 350);
        addObject(new SoundOn(), 677, 130);
        addObject(new SoundOff(), 821, 134);
    }
}
     

