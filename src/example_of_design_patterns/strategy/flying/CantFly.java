package example_of_design_patterns.strategy.flying;

/**
 * Class used if the Animal can't fly
 */
public class CantFly implements CanItFly
{
    @Override
    public String fly()
    {
        return "I can't fly";
    }
}
