package example_of_design_patterns.strategy.flying;

/**
 * Can have many flying classes implement CanItFly interface without affecting animal or the subclasses
 * Decoupling - encapsulating the behavior
 */
public interface CanItFly
{
    String fly();
}
