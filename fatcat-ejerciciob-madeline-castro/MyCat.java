import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MyCat is your own cat. Get it to do things by writing code in its act method.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyCat extends Cat
{
    /**
     * Act - do whatever the MyCat wants to do.
     */
    public void act()
    {
        {
        if (isAlone() == true){
            sleep(4);
            shoutHooray();
        } else{
            shoutHooray();
        }
        if(hasCompany() == true){ 
            shoutHooray();
            dance(); 
        } else{
            sleep(4);
        }
        if(isHungry() == true){
            eat();
            shoutHooray();
        }
        if(isBored() == true){
            dance();
        }
        
        /** Personalized routine
        walkRight();
        dance();
        eat(); 
        sleep(4); 
        */
        
    }    
    }    
}
