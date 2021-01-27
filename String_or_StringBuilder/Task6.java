import java.util.Scanner;
//6. Из заданной строки получить новую, повторив каждый символ дважды.

public class Task6 {
    public static void main(String[] args)  {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter string");
        String s = console.next();
        String doubleS = "";
        for (int i = 0; i < s.length(); i++) {
            doubleS += s.substring(i, i+1) + s.substring(i, i+1);
        }
        System.out.println(doubleS);
    }
}
