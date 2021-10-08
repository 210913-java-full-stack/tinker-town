package genericTest;

public class GenericThing<T> implements GenericInterface<T>{
    T t;
    int size;
    Object[] arr;

    public GenericThing(T t) {
        this.t = t;
        arr = new Object[5];
        arr[0] = t;
        size = 1;
    }

    public void addItem(T t) {
        if(size < 5) {
            arr[size] = t;
            size++;
        }
    }

    @Override
    public void testVoid() {
        System.out.println(t);
    }

    @Override
    public T testGenericType() {
        return t;
    }

    @Override
    public T[] testGenericArray() {
        return (T[]) arr;
    }
}
