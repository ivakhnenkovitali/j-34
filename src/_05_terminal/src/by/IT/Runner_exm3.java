package _05_terminal.src.by.IT;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static sun.net.InetAddressCachePolicy.get;

public class Runner_exm3 {
    public static void main(String[] args) {
        public class Runner_exm2<list1> {
            List<Person> personList = Arrays.asList(
                    new Person("Alex", 23),
                    new Person("Bob", 20),
                    new Person("Kate", 25),
                    new Person("Alex", 22),
                    new Person("Bob", 27),
                    new Person("Alex", 29)

            );
            double avgAge = personList.stream()
                    .collect(Collectors.averagingInt(person -> pepson.getAge()))

                      System.out.println("avgAge=" + avgAge);


           sum = personList.stream()
                        .map(person -> person.getAge())
                        .collect(Collectors.reducing(100, (age1, age2) -> age1 + age2));

                System.out.println("sum=" + sum);
            }
        }
    }
