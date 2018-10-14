package test;

public class GenericContainer<T, E> {
    private T obj;

    public GenericContainer(){
    }

    public GenericContainer(T t){
        obj = t;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T t) {
        obj = t;
    }

    public void printClass1(T t){
        System.out.println(t.getClass());
    }
    public <T> void printClass2(T t){
        System.out.println(t.getClass());
    }

    public <E> void printClass3(E e){
        System.out.println(e.getClass());
    }
}
