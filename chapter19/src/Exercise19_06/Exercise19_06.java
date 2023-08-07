package Exercise19_06;

public class Exercise19_06 {
    public static void main(String[] args) {
        Integer[][] list = {
                {1, 2, 3, 5},
                {3, 4, 5, 6},
                {1, 3, 15, 9},
                {4, 6, 8, 10},
                {1, 2, 3, 4}
        };

        System.out.println(max(list));
    }

    public static <E extends Comparable<E>> E max(E[][] list) {
        E object = list[0][0];

        for (int row = 0; row < list.length; row++){
            for (int column = 0; column < list[row].length; column++){
                if (list[row][column].compareTo(object) == 1){
                    object = list[row][column];
                }
            }
        }

        return object;
    }
}
