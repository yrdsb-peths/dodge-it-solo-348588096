
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(4);
        
        if(getX() >= 600){
            resetBall();
            
        }
    }    
    
    public void resetBall()
    {
        int num = Greenfoot.getRandomNumber(2);
        if (num == 0){
            setLocation(0,200);
        } else {
            setLocation(0,100);
        }

        
    }
}
