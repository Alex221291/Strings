import java.util.Scanner;
//5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
//Крайние пробелы в строке удалить.

public class Task5 {
    public static void main(String[] args)  {
        Scanner console = new Scanner(System.in);
        String s = "     парам пам  пам   пам       пам  ";
        s = s.replaceAll("  ", " ");
        s = s.trim();
        System.out.println("string without extra spaces:\n" + s);
    }
}
