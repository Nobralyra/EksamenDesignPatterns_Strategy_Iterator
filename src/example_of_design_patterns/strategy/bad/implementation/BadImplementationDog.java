package example_of_design_patterns.strategy.bad.implementation;

public class BadImplementationDog implements Flys
{
    @Override
    public void fly()
    {
        System.out.println("Can't fly");
    }
}
