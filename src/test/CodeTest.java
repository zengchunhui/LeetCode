package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodeTest {
    public static void main(String[] args){
//        List<Integer> listInteger = new ArrayList();
//        List<String> listString = new ArrayList<>();
//        System.out.println(listInteger.getClass().equals(listString.getClass()));//true
//        System.out.println(listInteger.getClass());//class java.util.ArrayList
//        System.out.println(listString.getClass());//class java.util.ArrayList

//        GenericContainer<Integer> integerContainer = new GenericContainer<>(1);
//        GenericContainer<String> stringContainer = new GenericContainer<>("string");
//        System.out.println(integerContainer.getObj()); //1
//        System.out.println(stringContainer.getObj()); //string
//
//        GenericContainer container = new GenericContainer();
//        container.setObj(1);
//        System.out.println(container.getObj()); //1
//        container.setObj("string");
//        System.out.println(stringContainer.getObj()); //string
//        Integer obj = (Integer) container.getObj();

//        GenericContainer<String> container = new GenericContainer<>("string");
//        container.printClass1(1);
//        container.printClass2(1);
//        container.printClass3(1.1);

        ArrayList<? extends  Number> numberList =  new ArrayList<Integer>();
        ArrayList<? super  Integer> numberS =  new ArrayList<Number>();
        numberS.add(1);
        numberS.add(2);
        numberS.get(1);


//        Number[] numbers = new Integer[10];
//        List<?> numberList = Arrays.asList(1);
//        Integer number = (Integer)numberList.get(0);
//        System.out.println(number);

    }
}
