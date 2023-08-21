package Exercise11_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DemoApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Inter integers, for stop enter zero (0): ");
        int integer = -1;

        do {
            integer = input.nextInt();

            if (integer != 0) {
                list.add(integer);
            }
        }
        while (integer != 0);

        System.out.println(max(list));
    }

    public static Integer max(ArrayList<Integer> list){
        if (list == null || list.isEmpty()){
            return null;
        }

        return Collections.max(list);
    }
}
