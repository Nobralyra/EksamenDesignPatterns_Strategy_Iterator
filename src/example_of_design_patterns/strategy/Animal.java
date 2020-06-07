package example_of_design_patterns.strategy;

import example_of_design_patterns.strategy.flying.CanItFly;

public class Animal
{
    //Composition - not inheritance
    public CanItFly flyingType;

    public Animal()
    {
    }

    //Animal pushes off the responsibility for flying to flyingType
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
