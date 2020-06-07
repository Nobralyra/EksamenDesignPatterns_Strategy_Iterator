package example_of_design_patterns.strategy.bad.inheritance;

public class BadInheritanceDog extends BadAnimal
{
    public BadInheritanceDog()
    {
        super();
        setSound("Bark");
    }

    /**
     * Could override the fly method, but it would break
     * the rule that we need to abstract what is different to
     * the subclasses
     */
    @Override
    public void fly()
    {
        System.out.println("Can't fly");
    }
}
