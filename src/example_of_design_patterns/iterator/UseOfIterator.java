package example_of_design_patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseOfIterator
{
    List<String> avengers = new ArrayList<>();

    public void addElements()
    {
        //Add some Avengers to the list
        avengers.add("Ant-Man");
        avengers.add("Black Widow");
        avengers.add("Captain America");
        avengers.add("Doctor Strange");
    }

    public void iterateArrayList()
    {
        System.out.println("\nIterator Example:");

        // First we make an Iterator by calling the .iterator() method on the collection
        Iterator<String> avengersIterator = avengers.iterator();

        // And now we use .hasNext() and .next() to go through it
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

            // First we must find the element we wish to remove
            if (avenger.equals("Ant-Man"))
            {
                // This will remove "Ant-Man" from the original collection, in this case a List
                avengersIterator.remove();
            }
        }
    }
}
