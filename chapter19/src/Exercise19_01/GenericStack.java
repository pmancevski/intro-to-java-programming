package Exercise19_01;

public class GenericStack<E> {
    private final int DEFAULT_SIZE = 5;
    private int size = 0;
    private E[] list = (E[]) new Object[DEFAULT_SIZE];

    public int getSize(){
        return size;
    }

    public E peek(){
        if (getSize() == 0){
            return list[size];
        }
        else {
            return list[getSize() - 1];
        }
    }

    public void push(E object){
        if (size == list.length){

            E[] temp = (E[]) new Object[list.length + 5];

            for (int count = 0; count < list.length; count++){
                temp[count] = list[count];
            }

            list = temp.clone();

            list[size++] = object;
        }
        else {
            list[size++] = object;
        }
    }

    public E pop(){
        E object = list[--size];
        return object;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder outputString = new StringBuilder();

        outputString.append("[");

        for (int count = 0; count < getSize(); count++){
            if (count == (getSize() - 1)){
                outputString.append(list[count]);
            }
            else {
                outputString.append(list[count]).append(", ");
            }
        }

        return "stack: " + outputString.append("]");
    }
}
