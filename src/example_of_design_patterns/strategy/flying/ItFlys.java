package example_of_design_patterns.strategy.flying;

public class ItFlys implements CanItFly
{
    @Override
    public String fly()
    {
        return "Flying High";
    }
}
