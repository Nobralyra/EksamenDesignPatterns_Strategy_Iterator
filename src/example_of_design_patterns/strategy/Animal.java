package example_of_design_patterns.strategy;

import example_of_design_patterns.strategy.flying.CanItFly;

public class Animal
{
    private String sound;

    /**
     * Instance Variable
     * Not using the interface in the traditional way, but as a Instance Variable that is a subclass of the CanItFly interface
     * Not inheritance but composition
     */
    public CanItFly flyingType;

    public String getSound()
    {
        return sound;
    }

    public void setSound(String sound)
    {
        this.sound = sound;
    }

    /**
     * Animal pushes off the responsibility for flying to flyingType
     */
    public String tryToFly()
    {
        return flyingType.fly();
    }

    /**
     * If you want to be able to change the flyingType dynamically
     * add the following method
     * @param newFlyType
     */
    public void setFlyingAbility(CanItFly newFlyType)
    {
        flyingType = newFlyType;
    }
}
