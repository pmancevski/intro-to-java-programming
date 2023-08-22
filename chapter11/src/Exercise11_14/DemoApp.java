package Exercise11_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DemoApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2= new ArrayList<>();

        System.out.print("Enter five integers for list1: ");
        for (int count = 0; count < 5; count++){
            list1.add(input.nextInt());
        }

        System.out.print("Enter five integers for list2: ");
        for (int count = 0; count < 5; count++){
            list2.add(input.nextInt());
        }

        System.out.print("The combined list is ");
        System.out.print(union(list1, list2).toString());
    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> returnedList = new ArrayList<>();

        returnedList.addAll(list1);
        returnedList.addAll(list2);

        return returnedList;
    }
}
