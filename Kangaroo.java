import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monkey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kangaroo extends Actor
{
    boolean atTop = true;
    public void act()
    {
        
        if(Greenfoot.mouseClicked(null))
        {
            atTop = !atTop;
        }
        
        
        if(atTop)
        {
            setLocation(300,100);
        }
        else 
        {
            setLocation(300,200);
        }
        
        
    }
}
