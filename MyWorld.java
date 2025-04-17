import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Banana banana = new Banana();
        addObject(banana, 600, 200);
        
        
        Kangaroo kangarooOne = new Kangaroo();
        addObject(kangarooOne,0,200);
        
        Kangaroo kangarooTwo = new Kangaroo();
        addObject(kangarooTwo,200,200);
        
        Tent tent = new Tent();
        addObject(tent,500,200);
        
        Butterfly butterfly = new Butterfly();
        addObject(butterfly,0,100);
        
        
    }
}
