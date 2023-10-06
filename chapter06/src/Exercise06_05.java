public class Exercise06_05 {
    public static void main(String[] args) {
        displaySortedNumbers(1.0, 2.0, 3.0);
        displaySortedNumbers(3.0, 2.0, 1.0);
        displaySortedNumbers(2.0, 1.0, 3.0);
        displaySortedNumbers(3.0, 1.0, 2.0);
        displaySortedNumbers(1.0, 3.0, 2.0);
        displaySortedNumbers(2.0, 3.0, 1.0);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3){
        if (num1 < num2 && num1 < num3){
            if (num2 < num3){
                System.out.println(num1 + ", " + num2 + ", " + num3);
            }
            else {
                System.out.println(num1 + ", " + num3 + ", " + num2);
            }
        }
        else if (num2 < num1 && num2 < num3){
            if (num1 < num3){
                System.out.println(num2 + ", " + num1 + ", " + num3);
            }
            else {
                System.out.println(num2 + ", " + num3 + ", " + num1);
            }
        }
        else if (num3 < num1 && num3 < num2){
            if (num1 < num2){
                System.out.println(num3 + ", " + num1 + ", " + num2);
            }
            else {
                System.out.println(num3 + ", " + num2 + ", " + num1);
            }
        }
    }
}
