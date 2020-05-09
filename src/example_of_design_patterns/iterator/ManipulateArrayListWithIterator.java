package example_of_design_patterns.iterator;

public class ManipulateArrayListWithIterator
{
    UseOfIterator useOfIterator = new UseOfIterator();

    public void showIteratorOnArrayList()
    {
        useOfIterator.addElements();
        useOfIterator.iterateArrayList();
        useOfIterator.removeElement();
        useOfIterator.iterateArrayList();
    }
}
