import greenfoot.*;
import java.util.List;
/**
 * A block that bounces back and forth across the screen.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class Block extends Actor
{
    private int delta = 2;
    private int X = 20;

    /**
     * Move across the screen, bounce off edges. Turn leaves, if we touch any.
     */
    public void act() 
    {
        move();
        checkEdge();
        checkMouseClick();
        Leaf leaf = (Leaf) getOneIntersectingObject(Leaf.class);
        if(leaf!=null){
            leaf.turn(3);
        }

    }
    /**
     * Move sideways, either left or right.
     */
    private void move()
    {
        setLocation(getX()+delta, getY());
        getWorld().getObjects(Pear.class);
    }

    /**
     * Check whether we are at the edge of the screen. If we are, turn around.
     */
    private void checkEdge()
    {
        if (isAtEdge()) 
        {
            X = -X;
            delta = -delta;
            World world = getWorld();
            world.addObject(new Leaf(),getX(),getY());
            List <Apple> apples = getWorld().getObjects(Apple.class);
            for (Apple a : apples){
                a.turn(90);   
            }
            List <Pear> pears = getWorld().getObjects(Pear.class);
            for(Pear p : pears){
             p.move(20);  
            }
        }

        // reverse direction
    } 

    /**
     * Check whether the mouse button was clicked. If it was, change all leaves.
     */
    private void checkMouseClick()
    {
        if (Greenfoot.mouseClicked(null)) 
        {
            List <Leaf> leaves = getWorld().getObjects(Leaf.class);
            for (Leaf l : leaves){
                l.changeImage();
            }
            // do this when the mouse is clicked. currently: nothing.
        }
    }

}
