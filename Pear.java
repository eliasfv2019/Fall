import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Pear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pear extends Actor
{
    /**
     * Act - do whatever the Pear wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Pear(){

    }

    public void act() 
    {
        if(isAtEdge()){
         setLocation(0,getY());   
        }
        // Add your action code here.
    }    
}
