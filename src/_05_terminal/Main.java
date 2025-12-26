package _05_terminal;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6);
        Optional<Integer> result = numbers.reduce((x, y) -> x + y);  /////−− −−− •••− −• −−− ••− −− −• −−− •••− •• − −••− •• •−•• •• −•• •−• ••− −−• •• • −•• • •−−− ••• − •−− •• •−•−


        System.out.println("Result:" + result.get());


        Stream<Integer> numbers1 = Stream.of(-4, -3, -2, 2, 3, 4);
        int identity = 1;                                              ///// −− −−− •••− −• −−− −• •− •−−• •• ••• •− − −••− −• −−− •−•• −••−

        Integer result1 = numbers1.reduce(identity, (x, y) -> x * y);
        System.out.println("Result:" + result1);

        List<PricedCar> cats = List.of(
                new PricedCar("Cat1", 5, 500),
                new PricedCar("Cat2", 3, 400),
                new PricedCar("Cat3", 3, 600),
                new PricedCar("Cat4", 1, 800),
                new PricedCar("Cat5", 4, 650)
        );

        int amount = cats.stream()
                .reduce(0,
                        (x, y) -> {

                            if ((y.getAge() < 3)) {
                                return x + y.getPrice();

                            } else {
                                return x;
                            }

                        }, (x, y) -> x + y);

        System.out.println("Amount = + amount");

        int integer = cats.stream()
                .filter(it -> it.getAge() < 3)
                .map(PricedCar::getPrice)
                .reduce(0, Integer::sum);
        System.out.println("Amount = " + integer);

        /////−• −−− •−− •− −−− • ••− ••• •−•• −−− •−− •• • •−−• •−• • •−− •−• −−− −−•− •− • −− •−− −•− −−− •−•• • −•− −•−• •• ••−−


        cats.stream()
                .filter(it -> it.getAge() < 3)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("---------------");


        System.out.println("-------------------------------");
        cats.stream()
                .collect(Collectors.toMap(k -> k.getName(), v -> v))
                .forEach((k, v) -> System.out.println(k + "- + v"));

        LinkedList<PricedCar> collect = new LinkedList<>(cats);
    }
    private static class PricedCar {
        private String name;
        private int age;
        private int price;

        public PricedCar(String name, int age, int price) {
            this.name = name;
            this.age = age;
            this.price = price;
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("PricedCar{");
            sb.append("name='").append(name).append('\'');
            sb.append(", age=").append(age);
            sb.append(", price=").append(price);
            sb.append('}');
            return sb.toString();
        }
    }


}
