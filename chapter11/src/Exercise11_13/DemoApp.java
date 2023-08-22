package Exercise11_13;

import java.util.ArrayList;
import java.util.Collections;

public class DemoApp {
    public static void main(String[] args) {

    }

    public static void removeDuplicate(ArrayList<Integer> list){
        for (int temp = 0; temp < list.size() - 1; temp++) {

            for (int count = temp + 1; count < list.size(); count++) {

                if (list.get(temp).equals(list.get(count))) {
                    list.remove(count);
                }
            }
        }
    }
}
