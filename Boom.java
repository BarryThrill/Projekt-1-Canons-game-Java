import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creates an explosion by changing images when someone is hit with a bullet and plays a sound
 * 
 * @author Barry Al-Jawari, Betim Goxhuli, Edi Imamovic, James Lay 
 *
 */
public class Boom extends GifActor
{
    int countingDown=0;
    int lagga=0;
    private SimpleTimer timer = new SimpleTimer();
    SoundOn soundon = new SoundOn();
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    private GreenfootImage image4;
    private GreenfootImage image5;
    private GreenfootImage image6;
    GreenfootSound booms = new GreenfootSound("boom.wav");
    int p1 = 1;
    int p2 = 2;
    int p3 = 3;
    int p4 = 4;

    //private GifImage gif = new GifImage("explosionn.gif");
    /**
     * Act - do whatever the Boom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void Boom()
    {
        image1 = new GreenfootImage("Explosion1.png");
        image2 = new GreenfootImage("Explosion2.png");
        image3 = new GreenfootImage("Explosion3.png");
        image4 = new GreenfootImage("Explosion4.png");
        image5 = new GreenfootImage("Explosion5.png");
        image6 = new GreenfootImage("Explosion6.png");
        setImage(image1);

    }

    public void addedToWorld(World world)
    {
        setImage("ex.gif"); //You must use the setImage method and not just right click + setImage in the GUI.
    }

    public void soundStart()
    {
        if(soundon.Sound=true)
        {
            booms.setVolume(100);
            booms.play();
           

        }
        if(soundon.Sound=false)
        {
            booms.setVolume(0);
            booms.play();
        }
    }

    public void act() 
    {
        soundStart();
        DeletePic();
        super.act();
    }   

    public void switchImage()
    {

        if(getImage() == image1){
            setImage(image2);

        }
        if(getImage() == image2){
            setImage(image3);
        }
        if(getImage() == image3){
            setImage(image4);
        }
        if(getImage() == image4){
            setImage(image5);
        }
        if(getImage() == image5){
            setImage(image6);
        }
    }

    public void DeletePic()
    {
        if (timer.millisElapsed() > 500){
            World world = getWorld();
            world.removeObject(this);
            
        }
    }

}
