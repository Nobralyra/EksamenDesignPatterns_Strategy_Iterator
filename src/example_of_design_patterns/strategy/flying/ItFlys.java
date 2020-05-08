package example_of_design_patterns.strategy.flying;

/**
 * Class used if the Animal can fly
 */
public class ItFlys implements CanItFly
{
    @Override
    public String fly()
    {
        return "Flying High";
    }
}
