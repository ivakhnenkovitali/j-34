package _05_terminal.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Runner_exm1 {
    public static void main(String[] args) {


        List<String> list1 = Arrays.asList("java", "c#", " javaScript", "PHP");

        ////создать новую колекцию состоящую из длин элементов
        ////коллекции list1

        List<Integer> numbers1 = new ArrayList<>();
        for (String str : list1) {
            numbers1.add(str.length());
        }
        System.out.println(list1);
        System.out.println(numbers1);

        //// java 8 - реализация этим примером
        ////collect - метод посзволяет получить данные изи стрима в новой коллекции

       List<Integer> numbers2 = list1.stream()
                .map(language -> language.length())
                .collect(Collectors.toCollection(() -> new LinkedList<>()));


        ///// определяем моссив вывод элемента стрима в массив
        int[] numbers3 = list1.stream()
                .mapToInt(language -> language.length())
                .toArray();
        System.out.println(numbers2);
        System.out.println(Arrays.toString(numbers3));




    }
}
