package example_of_design_patterns.strategy;

import example_of_design_patterns.strategy.flying.CanItFly;

public class Animal
{
    /**
     * Instance Variable
     * Not using the interface in the traditional way, but as a Instance Variable that is a subclass of the CanItFly interface
     * Not inheritance but composition
     */
    public CanItFly flyingType;

    public Animal()
    {
    }

    /**
     * Animal pushes off the responsibility for flying to flyingType
     */
    public String tryToFly()
    {
        return flyingType.fly();
    }

    /**
     * Change the flyingType dynamically
     * @param newFlyType
     */
    public void setFlyingAbility(CanItFly newFlyType)
    {
        flyingType = newFlyType;
    }
}
