package src;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Runner_exm1 {
    public static void main(String[] args) {
        /////функции интерфейсы java 8
        ////для работы с колекциями
        List<String> list1 = Arrays.asList("java", "C++", "javaScript", "PHP");

        for (String item : list1) {
            System.out.println(item);
        }
        //// java8
        ////метод forEach() используетсся для перебора элементов колекции и выполнения некторая действия
        ///во время этого пребора
        System.out.println("\njava8");
        Consumer<String> consumer = language -> System.out.println(language);
        list1.forEach(consumer);

        /////лямбда --вырожение допустима применять как в контексте отдельной локальной ( пример выше)переменной так и в контексте
        /////пораметра типа некоторого функционального интерфейса для любого метода
        list1.forEach(language -> System.out.println(language));
    }

}
