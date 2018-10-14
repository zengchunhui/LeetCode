package test;

public class GenericInImpl implements GenericInterface<String> {
    @Override
    public String get() {
        return null;
    }

    public <T> T returnT(T data){
        T obj = (T)new Object();
        return obj;
    }
}
