import java.util.Scanner;
//2. Замените в строке все вхождения 'word' на 'letter'.

public class Task2 {
    public static void main(String[] args)  {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter string S: ");
        String s = console.next();
        s = s.replaceAll("word", "letter");
        System.out.println(s);
    }
}
