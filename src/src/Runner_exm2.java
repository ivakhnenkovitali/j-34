package src;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Runner_exm2 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("java", "C#", "javaScript", "PHP");
        ////реализавать сортировку элемнтов колекции по позростанию
        ////количество символов в каждом из элементов
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return str1.length() - str2.length();
            }
        };
        list1.sort(comparator);
        list1.forEach(item -> System.out.println(item));
  //////java 8
        /////сортировака по убыванию
    list1.sort((str1, str2) -> str2.length() - str1.length() );
        System.out.println("\n");
    list1.forEach(item -> System.out.println(item));
    }
}
