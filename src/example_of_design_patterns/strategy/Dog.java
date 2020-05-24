package example_of_design_patterns.strategy;

import example_of_design_patterns.strategy.flying.CantFly;

public class Dog extends Animal
{
    public Dog()
    {
        super();

        /** BAD
        * You could override the fly method, but we are breaking
        * the rule that we need to abstract what is different to
        * the subclasses
        *
        public void fly()
         {
            System.out.println("I can't fly");
         }
         */

        //Sets the CantItFly interface polymorphically
        flyingType = new CantFly();
    }
}
