package Exercise11_07;

import java.util.ArrayList;
import java.util.Collections;

public class DemoApp {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int count = 0; count < 10; count++){
            list.add(count);
        }

        shuffle(list);

        for (Integer integer : list){
            System.out.print(integer + " ");
        }
    }

    public static void shuffle(ArrayList<Integer> list) {
        Collections.shuffle(list);
    }
}
