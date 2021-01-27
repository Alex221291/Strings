import java.util.Scanner;
//5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

public class Task5 {
    public static void main(String[] args)  {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter string");
        String s = console.next();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println("the letter 'a' is found " + count + " times");
    }
}
