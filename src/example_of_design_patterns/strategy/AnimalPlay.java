package example_of_design_patterns.strategy;

import example_of_design_patterns.strategy.flying.ItFlys;

public class AnimalPlay
{
    private Animal bamse = new Dog();
    private Animal andrea = new Bird();

    public void wgg()
    {
        System.out.println("Dog: " + bamse.tryToFly());
        System.out.println("Bird: " + andrea.tryToFly());

        // This allows dynamic changes for flyingType
        bamse.setFlyingAbility(new ItFlys());
        System.out.println("Dog: " + bamse.tryToFly());
    }
}
