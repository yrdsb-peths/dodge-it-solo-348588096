import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        Banana banana = new Banana();
        addObject(banana, 100,100);
        
    }
}
