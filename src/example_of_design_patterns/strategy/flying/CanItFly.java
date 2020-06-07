package example_of_design_patterns.strategy.flying;

/**
 * Many flying classes can implement CanItFly interface - do not affecting Animal or the subclasses
 * Decoupling - encapsulating the behavior
 */
public interface CanItFly
{
    String fly();
}
