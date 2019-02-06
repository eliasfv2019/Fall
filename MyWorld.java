import greenfoot.*;

/**
 * Autumn. A world with some leaves.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class MyWorld extends World
{
    /**
     * Create the world and objects in it.
     */
    public MyWorld()
    {    
        super(600, 400, 1);
        setUp();
    }

    /**
     * Create the initial objects in the world.
     */
    private void setUp()
    {
        addObject(new Block(), 300, 200);
        for(int i = 0; i < 12; i++){
            addObject(new Apple(), Greenfoot.getRandomNumber(580), Greenfoot.getRandomNumber(400));
        }
        for(int i = 0; i < 8; i++){
            addObject(new Pear(), Greenfoot.getRandomNumber(580), Greenfoot.getRandomNumber(400));
        }
    }
}
