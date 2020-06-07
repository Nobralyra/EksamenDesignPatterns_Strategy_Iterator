package example_of_design_patterns.strategy;

import example_of_design_patterns.strategy.flying.CanNotFly;

public class Dog extends Animal
{
    public Dog()
    {
        super();

        //Sets the CantItFly interface polymorphically
        flyingType = new CanNotFly();
    }
}
