package _07_test.src.IT.by.model.utils.Utils;

import _07_test.src.IT.by.model.Animal;
import _07_test.src.IT.by.model.Cat;
import _07_test.src.IT.by.model.Dog;
import _07_test.src.IT.by.model.Genus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AnimalFactory {

    public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd-MM-y");
    private static final String EMAIL_REGEX = "[\\w!#$%&*+/=?^'`{|}~\\-]+(?:\\.[\\w!#$%&*+/=?^'`{|}~\\-]+)*@(?:[a-zA-Z\\d](?:[a-zA-Z\\d\\-]*[a-zA-Z\\d])?\\.)+[a-zA-Z\\d][a-zA-Z\\d\\-]*[a-zA-Z\\d]";

    public static Animal getInstance(String line) {
        String[] stringArray = line.split("[;,]");
        try {
            long chipNumber = Long.parseLong(validateStringMatches(stringArray[0], "(?=\\d{15}\\b)\\d{3}09(?:81|56)\\d{8}"));
            String name = validateStringByEmpty(stringArray[2]);
            LocalDate birthDate = LocalDate.parse(stringArray[3], FORMATTER);
            String breed = validateStringByEmpty(stringArray[4]);
            String email = validateStringMatches(stringArray[5], EMAIL_REGEX);
            return "cat".equalsIgnoreCase(stringArray[1])
                    ? new Cat(chipNumber, Genus.of(stringArray[1]), name, birthDate, breed, email)
                    : new Dog(chipNumber, Genus.DOG, name, birthDate, breed, email);


        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }


    private static String validateStringMatches(String value, String regEx) throws IllegalAccessException {
        if (value.matches(regEx)) {
            return value;


        }
        throw new IllegalStateException("Chip Number or Email not valid");
    }

    private static String validateStringByEmpty(String value) {
        if (!value.isEmpty()) {
            return value;
        }
        throw new IllegalStateException("Name or Breed is empty");
    }
}
