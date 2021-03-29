import java.lang.reflect.Array;
import java.util.ArrayList;

public class SortedArrayList<T extends  Comparable<T>> implements SortedList<T> {
    protected T[] a;
    protected int size;

    public SortedArrayList() {
        a = (T[]) new Comparable[10];
        size = 0;
    }

    /**
     * helper function for add functions
     */
    private void grow_array() //doubles size of array
    {
        T[] new_arr = (T[]) new Comparable[size *= 2];
        for (int i = 0; i < size; i++)
            new_arr[i] = a[i];
        a = new_arr;
    }

    // add method that uses compareTo to figure out where to add
    @Override
    public boolean add(T item) throws Exception {

        // if the ArrayList is full, double the Array
        if (size == a.length) {
            grow_array();
        }

        // if ArrayList is size 0. Simply just add the item
        if (size == 0) {
            a[size++] = item;
            return true;
        }

        int i = size-1;
        size++;
        // use compareTo methods to add elements in ascending order
        while (a[i].compareTo(item) > 0) {
            a[i+1] = a[i];
            if (i > 0) {
                i--;
            } else {
                a[i] = item;
                return true;
            }
        }
        a[i+1] = item;
        return true;
    }


    @Override
    public T remove(int pos) throws Exception {
        if (pos < 0 || pos >= size) {
            throw new Exception("Invalid Position for Remove!!");
        }

        // copy item in the array
        T item = a[pos];

        // move stuff in array over
        for (int i = pos; i < size - 1; i++) {
            a[i] = a[i + 1];
        }

        size -= 1;
        return item;
    }

    @Override
    public T get(int pos) throws Exception {
        if (pos < 0 || pos >= size) {
            throw new Exception("Invalid Position for Get!!");
        }
        return a[pos];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++) {
            result = result + a[i] + " ";
        }
        return result;
    }


}
