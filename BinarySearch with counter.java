import java.util.Arrays;

public class BinarySearch {

 
    private BinarySearch() { }

 
    public static int indexOf(int[] a, int key, Counter b) {
        
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            
            a.increment();
            
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }


    @Deprecated
    public static int rank(int key, int[] a, Counter b) {
        return indexOf(a, key,, b);
    }

  
    public static void main(String[] args) {

        // read the integers from a file
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();

        // sort the array
        Arrays.sort(whitelist);
        
        Counter b = new Counter ("Sunbro");

        // read integer key from standard input; print if not in whitelist
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (BinarySearch.indexOf(whitelist, key) == -1)
                StdOut.println(key);
        }
    }
}

public class Counter 
{
    private int count; //counter value
    private final String name; //counter name
   
    public Counter (String id)
    {
        name = id; }
    
    public int increment()
    {
        count++; }
    
    public String toString()
    {
        return count;}
}