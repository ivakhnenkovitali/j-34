package src;

import java.util.Arrays;
import java.util.List;
public class Runner_exm4 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("java", "C#", "javaScript", "PHP");
        ///////среди всех элементов колекции выввести
        ////максимальное колчичество символов в элементе
        int maxLength = 0;
        for (String item : list1) {
            if (item.length() > maxLength) {
                maxLength = item.length();
            }
        }
        System.out.println("max length=" + maxLength);
        /////java 8
        maxLength = list1.stream()
                .mapToInt(str -> str.length())
                .max()
                .getAsInt();
        System.out.println("\nmax length" + maxLength);
    }
}
