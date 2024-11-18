package _07_test.src.IT.by.model;

import IT.by.model.utils.Utils.CompetitionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();
        Map<String, String> errors = new HashMap<>();


        CompetitionUtils.parseFile(cats, dogs);

        System.out.println("Cats list size = " + cats.size());
        cats.forEach(System.out::println);
        System.out.printf("Dogs list size = " + dogs.size());
        dogs.forEach(System.out::println);
        System.out.printf("Errors quantity = " + errors.size());
        errors.entrySet().forEach(it -> System.out.println(it.getKey() + "; " + it.getValue()));



    }
}
///•−−• •− −− −•−− •−•• −•− •−− −•−− •−−• •−• •− •−•• • −• −•−− •−•−
