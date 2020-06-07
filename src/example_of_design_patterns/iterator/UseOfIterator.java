package example_of_design_patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseOfIterator
{
    List<String> avengers = new ArrayList<>();

    public void addElements()
    {
        avengers.add("Ant-Man");
        avengers.add("Black Widow");
        avengers.add("Captain America");
        avengers.add("Doctor Strange");
    }

    public void iterateArrayList()
    {
        System.out.println("\nIterator Example:");
        Iterator<String> avengersIterator = avengers.iterator();

        while (avengersIterator.hasNext())
        {
            String currentAvenger = avengersIterator.next();
            System.out.println(currentAvenger);
        }
    }

    public void removeElement()
    {
        Iterator<String> avengersIterator = avengers.iterator();
        while (avengersIterator.hasNext())
        {
            String avenger = avengersIterator.next();

            if (avenger.equals("Ant-Man"))
            {
                avengersIterator.remove();
            }
        }
    }
}
