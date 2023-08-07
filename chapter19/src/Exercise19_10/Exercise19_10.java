package Exercise19_10;

import java.util.ArrayList;

public class Exercise19_10 {

    public static <E extends Comparable<E>> E max(ArrayList<E> list){
        E obj = list.get(0);

        for (int count = 1; count < list.size(); count++){
            if (list.get(count).compareTo(obj) > 0){
                obj = list.get(count);
            }
        }

        return obj;
    }
}
