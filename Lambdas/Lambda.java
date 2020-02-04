import java.util.*;

public class Lambda {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int length = args.length;
        for(int i = 0; i < length; i++) {
            list.add(args[i]);
        }
        // BELOW THE SYSTEM OUT CAN BE REPLACED WITH AN OBJECT
        // THE PRINTLN CAN BE REPLACED WITH A METHOD IN SAID OBJ
        // list.forEach(System.out::println);
        list.forEach(s-> System.out.println(s.toLowerCase()));
    }
}