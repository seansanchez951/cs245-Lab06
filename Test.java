import java.util.ArrayList;
import java.util.Arrays;

// program to test code

public class Test {


    public static void main(String[] args) throws Exception {

        //test constructor
        SortedArrayList<String> a1 = new SortedArrayList<String>();

        // testing empty at start for size function
        System.out.println("Size of ArrayList: " + a1.size());

        // remove comment dashes below to test invalid get position
        // testing exception for get position, having an empty list
        // System.out.println("Value at location 3, should throw exception: " + a1.get(3));

        //testing add
        a1.add("Z");
        a1.add(("Y"));
        a1.add(("X"));
        a1.add(("W"));
        a1.add(("U"));
        a1.add(("V"));
        a1.add(("U"));
        a1.add(("T"));
        a1.add(("S"));

        System.out.println("Printing Sorted ArrayList after add function");
        System.out.println(a1);

        System.out.println("Testing Size of ArrayList: " + a1.size());

        // testing get function for SortedArrayList
        System.out.println("Value at location index 4: " + a1.get(4));

        // remove comment dashes below to test invalid position call
        // System.out.println("value at invalid location index: " + a1.get(11));

        // testing remove function
        System.out.println("Removed and returned item at location 3: " + a1.remove(2));

        // remove comment dashes below to test invalid remove position call
        // System.out.println("Remove and returned item in invalid position: " + a1.remove(99));

        System.out.println("Printing sorted add function with one item removed");
        System.out.println(a1);

        System.out.println("Testing Size of ArrayList: " + a1.size());


        // testing for SortedLinkedList

        // SortedLinkedList Declaration test constructor
        SortedLinkedList<String> L1 = new SortedLinkedList<String>();

        // testing empty at start for size function for linked list
        System.out.println("Size of SortedLinkedList: " + L1.size());

        // remove comment dashes below to test invalid get position call
        // testing exception for get position, having an empty list
        // System.out.println("Value at location 3, should throw exception: " + L1.get(3));

        // testing add data to SortedLinkedList
        L1.add("2");
        L1.add(("5"));
        L1.add(("1"));
        L1.add(("8"));
        L1.add(("9"));
        L1.add(("3"));
        L1.add(("8"));
        L1.add(("7"));

        System.out.println("Printing Sorted LinkedList after add function");
        // print SortedLinkedList
        System.out.println(L1);

        // testing size function with added elements
        System.out.println("Size of SortedLinkedList with elements added : " + L1.size());

        // testing get function for SortedLinkedList
        System.out.println("Value at location index 3: "+ L1.get(3));

        // remove comment dashes below to test invalid position call
        // System.out.println("value at invalid location index for LinkedList: " + L1.get(-1));


        // testing remove function with print statements for SortedLinkedList and size
        System.out.println("Removed and returned item at location 6: "+ L1.remove(6));

        // testing updated Linkedlist with one element removed
        System.out.println("Updated LinkedList with one element removed: " + L1);
        System.out.println("Size of SortedLinkedList with one element removed : " + L1.size());

        // remove comment dashes below to test invalid remove position call
        // System.out.println("Remove and returned item in invalid position: " + L1.remove(99));


    }

}
