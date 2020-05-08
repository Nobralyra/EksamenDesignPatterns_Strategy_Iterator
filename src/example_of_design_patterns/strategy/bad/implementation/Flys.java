package example_of_design_patterns.strategy.bad.implementation;

public interface Flys
{
    /** Bad
     * It is never a good idea to use an Interface just to force
     * the creation of a method, because it would create a lot of duplicate code
     */
    void fly();
}
