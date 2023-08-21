package Exercise10_10;

public class DemoApp {
    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println("Check size: " + queue.getSize());
        System.out.println("Is empty? " + queue.empty());

        for (int count = 0; count < 20; count++){
            queue.enqueue(count);
        }

        System.out.println("Check size: " + queue.getSize());
        System.out.println("Is empty? " + queue.empty());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());

        System.out.println("Check size: " + queue.getSize());
        System.out.println("Is empty? " + queue.empty());
    }
}
