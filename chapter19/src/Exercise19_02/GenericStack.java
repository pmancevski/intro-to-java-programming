package Exercise19_02;

import java.util.ArrayList;

public class GenericStack<E> extends ArrayList<E> {

    public E peek(){
        return get(size() - 1);
    }

    public void push (E obj){
        add(obj);
    }

    public E pop(){
        return remove(size() - 1);
    }

    @Override
    public String toString(){
        return "stack: " + super.toString();
    }
}
