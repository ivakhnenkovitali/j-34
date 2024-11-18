package _07_test.src.IT.by.model.utils.Utils;


import _07_test.src.IT.by.model.Animal;
import _07_test.src.IT.by.model.Cat;
import _07_test.src.IT.by.model.Dog;
import _07_test.src.IT.by.model.exceoptons.CompetitionException;
import lombok.experimental.UtilityClass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@UtilityClass
public class CompetitionUtils {
    final String PATH_TO_FILE = "src/IT/by/model/resources/animals.txt";

    public static void parseFile(List<Cat> cats, List<Dog> dogs) {
        try (Scanner sc = new Scanner(new FileReader(PATH_TO_FILE))) {
            while (sc.hasNext()) {
                 System.out.println(sc.nextLine());
                ///fillingCollections(sc.nextLine(), cats, dogs, errors);

            }
        } catch (FileNotFoundException e) {
            System.out.printf("File hasn't found by path %s %n", PATH_TO_FILE);
            System.exit(1);
        }

    }
}

    ///===========================================================

