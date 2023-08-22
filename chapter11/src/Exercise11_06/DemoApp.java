package Exercise11_06;

import Exercise11_06.model.Circle;
import Exercise11_06.model.Loan;

import java.util.ArrayList;
import java.util.Date;

public class DemoApp {
    public static void main(String[] args) {
        ArrayList<Object> objectArrayList = new ArrayList<>();

        objectArrayList.add(new Loan());
        objectArrayList.add(new Date());
        objectArrayList.add(new Circle());

        for (Object obj : objectArrayList){
            System.out.println(obj);
        }
    }
}
