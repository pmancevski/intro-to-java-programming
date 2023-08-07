package Exercise19_03;

import java.util.ArrayList;
import java.util.Collections;

public class DemoApp {
    public static void main(String[] args) {
        ArrayList<String> testArray = new ArrayList<>();

        testArray.add("Bitola");
        testArray.add("Skopje");
        testArray.add("Bitola");

        testArray = removeDuplicates(testArray);


        System.out.println(testArray.toString());
    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> returnedArray = new ArrayList<>();

        for (E object : list){
            if (!returnedArray.contains(object)){
                returnedArray.add(object);
            }
        }

        return returnedArray;
    }
}
