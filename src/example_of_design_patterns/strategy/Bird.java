package example_of_design_patterns.strategy;

import example_of_design_patterns.strategy.flying.ItFlys;

public class Bird extends Animal
{
    public Bird()
    {
        super();
        setSound("Pip");

        //Sets the CantItFly interface polymorphically
        //This sets the behavior as a flying Animal
        flyingType = new ItFlys();
    }
}
