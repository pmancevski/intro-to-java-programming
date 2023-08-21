package Exercise10_10;

public class Queue {
    private int[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 8;

    public Queue(){
        elements = new int[DEFAULT_CAPACITY];
    }

    public void enqueue(int element){
        if (size >= elements.length){
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }

        elements[size++] = element;
    }

    public int dequeue(){
        int element = elements[0];
        int[] temp = new int[elements.length];
        System.arraycopy(elements, 1, temp, 0, elements.length - 1);
        elements = temp;
        size--;

        return element;
    }

    public boolean empty(){
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
