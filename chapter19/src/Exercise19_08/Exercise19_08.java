package Exercise19_08;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise19_08 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list.toString());
        shuffle(list);
        System.out.println(list.toString());
    }

    public static <E> void shuffle(ArrayList<E> list) {
        Collections.shuffle(list);
    }
}
