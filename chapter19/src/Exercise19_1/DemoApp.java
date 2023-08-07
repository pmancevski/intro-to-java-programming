package Exercise19_1;

//This class is mostly for testing methods in GenericStack.java

public class DemoApp {
    public static void main(String[] args) {
        GenericStack<Integer> genericStack = new GenericStack<>();

        System.out.println("Check length: " + genericStack.getSize());

        System.out.println("Empty stack peek: " + genericStack.peek());

        System.out.println("Push: 1 and 5 ...");
        genericStack.push(1);
        genericStack.push(5);

        System.out.println("Check length: " + genericStack.getSize());

        System.out.println("Peek: " + genericStack.peek());
        System.out.println("Peek: " + genericStack.peek());

        System.out.println("Pop last element: " + genericStack.pop());
        //expecting length = 1
        System.out.println("Check length: " + genericStack.getSize());
        System.out.println("Peek (which element is returned): " + genericStack.peek());
        //expecting false
        System.out.println("Is stack empty? " + genericStack.isEmpty());
        genericStack.pop();
        //expecting true
        System.out.println("Is stack empty? " + genericStack.isEmpty());

        genericStack.push(3);
        genericStack.push(1);
        genericStack.push(9);
        genericStack.push(5);
        System.out.println(genericStack.toString());

        //test dynamic increase of length
        genericStack.push(8);
        System.out.println(genericStack.toString());
        System.out.println(genericStack.getSize());
        genericStack.push(-1);
        System.out.println(genericStack.toString());
        System.out.println(genericStack.getSize());
    }
}
