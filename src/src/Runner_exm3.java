package src;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Runner_exm3 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("java", "C#", "javaScript", "PHP");
        ////использование интерфейса Stream В Java 8
        Stream<String> stream1 = list1.stream();
        stream1.forEach(item -> System.out.println(item));
        /// объект  stream может быть использован единожды для совершения новых действий над объектоми колекции
        ////через стримы нужно будет создовать новый объект stream

        System.out.println("\n");
        Stream<String> stream2 = list1.stream();
        stream1.forEach(item -> System.out.println(item));

        /////поскольку неудобно всегда создовать новую переменную для работы со стримами то применяют
        ///способ столбчатой записи вызова методов
        ////Для столбчатой записи вызова метода нужно понимать
        ///какой из методов является терминальным а какой - нетерминальныйм

        //// это нарастающий метод- если метод возращает новый stream как результат своей работы
        ////то данный является нетерминальной операцией
        ////если метод возращает результат своей работы отличный от Stream
        ////то данный метод является терминальнй операцией

        list1.stream()
                .forEach(item -> System.out.println(item));

        ///так ка метод sorted() является нетерминальной операцией то
        ////можно продолжить вызывать метод в столбичной записи
        ///любой терминальный метод завершает столбичную запись вызова метода


        System.out.println("\nSorted about stream");
        list1.stream()
                .sorted((item1, item2) -> item1.length() - item1.length())
                .forEach(item -> System.out.println(item));


        System.out.println("\nOriginal collection");
        list1.forEach(item -> System.out.println(item));


    }
}
