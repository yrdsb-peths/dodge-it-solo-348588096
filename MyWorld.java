import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
 
        
        Kangaroo kangarooOne = new Kangaroo();
        addObject(kangarooOne,300,200);
        
        Ball ball = new Ball();
        addObject(ball,0,200);
        
        
        
    }
}
