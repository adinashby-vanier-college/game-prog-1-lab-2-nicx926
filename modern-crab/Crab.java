// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * 
 */
public class Crab extends Actor
{
    private int wormEaten;

    /**
     * 
     */
    public Crab()
    {
        wormEaten = 0;
    }

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Act - do whatever the Crab wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    final public void act()
    {
        move(4);
        if (Greenfoot.isKeyDown("left")) {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(3);
        }
        if (foundworm()) {
            eatworm();
            
        }
    }

    /**
     * 
     */
    public boolean foundworm()
    {
        Actor worm = getOneObjectAtOffset(0, 0, worm.class);
        return worm != null;
    }

    /**
     * 
     */
    public void eatworm()
    {
        Actor worm = getOneObjectAtOffset(0, 0, worm.class);
        if (worm != null) {
            getWorld().removeObject(worm);
        }
    }
}
