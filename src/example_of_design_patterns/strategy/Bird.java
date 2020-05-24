package example_of_design_patterns.strategy;

import example_of_design_patterns.strategy.flying.ItFlys;

public class Bird extends Animal
{
    public Bird()
    {
        super();

        //Sets the CantItFly interface polymorphically
        flyingType = new ItFlys();
    }
}
