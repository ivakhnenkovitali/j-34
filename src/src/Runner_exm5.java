package src;

import by.IT.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Runner_exm5 {
    public static void main(String[] args) {
        List<Student>students = Arrays.asList(
                new Student(1, "Alex"),
                new Student(4, "Kate"),
                new Student(8, "Bob"),
                new Student(2, "Masha")

        );

        ////вывести в консоль имена студентов в отсортированные по значению имени в алфавитном порядке
        ////(исходную коллекцию сортировать нельзя )

        List<String> nameList = new ArrayList<>();
        for (Student student : students) {
            String name = student.getName();
            nameList.add(name);
        }


        nameList.sort(Comparator.naturalOrder());

        for (String name : nameList) {
            System.out.println(name);
        }
        /////java8

        students.stream()
                .map(stud -> stud.getName())
                .sorted()
                .forEach(name -> System.out.println(name));


    }
}
