package Exercise11_12;

import java.util.ArrayList;
import java.util.Collections;

public class DemoApp {
    public static void main(String[] args) {

    }

    public static double sum(ArrayList<Double> list){
        double sum = 0;

        for (Double d : list){
            sum += d;
        }

        return sum;
    }
}
