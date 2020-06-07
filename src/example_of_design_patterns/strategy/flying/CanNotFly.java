package example_of_design_patterns.strategy.flying;

public class CanNotFly implements CanItFly
{
    @Override
    public String fly()
    {
        return "I can't fly";
    }
}
