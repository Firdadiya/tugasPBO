import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ruuto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ruuto extends Actor
{
    /**
     * Act - do whatever the ruuto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        mover() ;  //call a method
    }
    
    public void mover()   //methode definition
    {
        if(Greenfoot.isKeyDown("left")){
             setLocation(getX() -3, getY());
        }
        
        if(Greenfoot.isKeyDown("right")){
             setLocation(getX() +3, getY());
        }
        
        if(Greenfoot.isKeyDown("Up")){
             setLocation(getX(), getY() -2);
        }
        
        if(Greenfoot.isKeyDown("Down")){
             setLocation(getX(), getY() +2);
        }
    }
}

