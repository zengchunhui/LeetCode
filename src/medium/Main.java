package medium;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Number n = 0.0;
        Class<? extends Number> nClass = n.getClass();
        System.out.println(nClass.equals(Double.class));

        Number n2 = 0;
        Class<? extends Number> n2Class = n.getClass();
        System.out.println(nClass.equals(Integer.class));
    }
}