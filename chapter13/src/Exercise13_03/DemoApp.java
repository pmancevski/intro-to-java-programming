package Exercise13_03;

import java.util.ArrayList;
import java.util.Collections;

public class DemoApp {
    public static void main(String[] args) {
        // Create and arrayList
        ArrayList<Number> list = new ArrayList<>();

        // Add unsorted numbers to list
        list.add(1);
        list.add(8);
        list.add(2.3);
        list.add(7.43);
        list.add(3);
        list.add(6.246);
        list.add(5);
        list.add(4.6);

        System.out.println(list.toString());

        // Sort list
        sort(list);

        // Display list of sorted numbers
        System.out.println(list.toString());
    }

    public static void sort(ArrayList<Number> list) {

        for (int elementIndex = 0; elementIndex < list.size() - 1; elementIndex++){
            double currentMin = list.get(elementIndex).doubleValue();
            int currentIndex = elementIndex;

            for (int count = elementIndex + 1; count < list.size(); count++){
                if (currentMin > list.get(count).doubleValue()){
                    currentMin = list.get(count).doubleValue();
                    currentIndex = count;
                }
            }

            if (currentIndex != elementIndex){
                list.set(currentIndex, list.get(elementIndex));
                list.set(elementIndex, currentMin);
            }
        }
    }
}
