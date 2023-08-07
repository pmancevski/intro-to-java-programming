package Exercise19_04;

import java.util.Collections;

public class Exercise19_04 {
    public static void main(String[] args) {
        String[] list = new String[5];

        list[0] = "Bitola";
        list[1] = "Skopje";
        list[2] = "Prilep";
        list[3] = "Ohrid";
        list[4] = "Resen";

        System.out.println(linearSearch(list, "Ohrid"));
    }

    public static <E extends Comparable<E>> int linearSearch(E[] list, E key){
        int index = -1;

        for (int count = 0; count < list.length; count++){
            if (list[count].compareTo(key) == 0){
                index = count;
            }
        }

        return index;
    }
}
