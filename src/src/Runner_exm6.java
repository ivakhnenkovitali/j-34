package src;

import by.IT.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Runner_exm6 {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student(1, "Alex"),
                new Student(4, "Kate"),
                new Student(8, "Bob"),
                new Student(2, "Masha")

        );


        /////ВЫвести в консоль имена студентов


         List<String> nameList = new ArrayList<>();
         for (Student student : students) {
             if (student.getId() % 2 == 0) {
                 String name = student.getName();
                 nameList.add(name);
             }
         }



             nameList.sort(Comparator.naturalOrder());

             for (String name : nameList) {
                 System.out.println(name);
             }


//////java 8

             System.out.println();
             students.stream()
                     .filter(stud -> stud.getId() % 2 == 0)
                     .map(stud -> stud.getName())
                     .sorted()
                     .forEach(name -> System.out.println(name));



    }
}
