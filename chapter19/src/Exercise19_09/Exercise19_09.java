package Exercise19_09;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise19_09 {
    public static void main(String[] args) {

    }

    public static <E extends Comparable<E>> void sort(ArrayList<E> list){
        Collections.sort(list);
    }
}
