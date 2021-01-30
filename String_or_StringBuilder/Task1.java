import java.util.Arrays;
import java.util.Scanner;
//1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

public class Task1 {
    public static void main(String[] args)  {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter string:");
        String s = console.nextLine();
        int maxWhitespace = 0;
        int currentWhitespace = 0;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                currentWhitespace++;
                if (currentWhitespace > maxWhitespace) maxWhitespace = currentWhitespace;
            } else currentWhitespace = 0;
        }
        System.out.println(maxWhitespace);
    }
}
