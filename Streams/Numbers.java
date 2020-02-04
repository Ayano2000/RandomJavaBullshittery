import java.util.*;
import java.util.stream.IntStream;

public class Numbers {
    // streams can be used to filter or parse large amounts of data.
    public static void main(String[] args) {
        // this uses lambdas to print out the digits from 1 too 100

        IntStream.range(1, 21).forEach(s -> System.out.println(s));

        // populate a list with all ints from 1-100 using a lambda and a stream
        List<Integer> list = new ArrayList<>();
        IntStream.range(1, 21).forEach(num -> list.add(num));
        // This is weird. I want to use a stream to grab x amount of data from an
        // existing data set, i cant figure out how to do that just yet
        System.out.println("Size " + list.size());
    }

}