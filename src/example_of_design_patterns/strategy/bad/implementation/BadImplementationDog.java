package example_of_design_patterns.strategy.bad.implementation;

public class BadImplementationDog implements Flys
{
    /**
     * Bad
     * You could override the fly method, but it is never a good idea to use
     * an Interface just to force the creation of a method
     */
    @Override
    public void fly()
    {
        System.out.println("Can't fly");
    }
}
