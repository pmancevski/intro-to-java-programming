package Exercise11_10;

import java.util.ArrayList;

public class MyStack extends ArrayList {

    public int getSize(){
        return size();
    }

    public Object peek(){
        return get(getSize() - 1);
    }

    public Object pop(){
        Object object = get(getSize() - 1);
        remove(getSize() - 1);

        return object;
    }

    public void push(Object obj){
        add(obj);
    }

    public String toString() {
        return "stack: " + super.toString();
    }
}
