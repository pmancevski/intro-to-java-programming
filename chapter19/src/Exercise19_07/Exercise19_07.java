package Exercise19_07;

public class Exercise19_07 {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(binarySearch(array, 9));
    }

    public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {

            int mid = (low + high) / 2;

            if (key.compareTo(list[mid]) < 0) {
                high = mid - 1;
            } else if (key.compareTo(list[mid]) == 0) {
                return mid;
            } else if (key.compareTo(list[mid]) > 0) {
                low = mid + 1;
            }
        }

        return -low - 1;
    }
}
