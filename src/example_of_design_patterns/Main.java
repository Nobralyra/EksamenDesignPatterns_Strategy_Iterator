package example_of_design_patterns;

import example_of_design_patterns.iterator.ManipulateArrayListWithIterator;
import example_of_design_patterns.strategy.AnimalPlay;

public class Main
{
    public static void main(String[] args)
    {
        AnimalPlay animalPlay = new AnimalPlay();
        animalPlay.showDynamicChanges();

        ManipulateArrayListWithIterator manipulateArrayListWithIterator = new ManipulateArrayListWithIterator();
        manipulateArrayListWithIterator.showIteratorOnArrayList();
    }

    /**
     * AnimalPlay.java
     * Animal.java
     * CanItFly.java
     * CanNotFly.java
     * ItFlys.java
     * Dog.java
     * Bird.java
     */
}
