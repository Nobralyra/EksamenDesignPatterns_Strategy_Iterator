package example_of_design_patterns.strategy.bad.inheritance;

public class BadAnimal
{
    private String sound;

    public String getSound()
    {
        return sound;
    }

    public void setSound(String sound)
    {
        this.sound = sound;
    }

    /**
     * Do not add methods to the super class, because every subclass
     * then needs to override this method - duplicate code!
     * Need to separate what is different between subclasses and the super class
     */
    public void fly()
     {
        System.out.println("I'm flying");
     }
}
