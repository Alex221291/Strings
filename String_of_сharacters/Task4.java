import java.util.Scanner;
//4. В строке найти количество чисел.

public class Task4 {
    public static void main(String[] args)  {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter string S: ");
        String s = console.next();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                count++;
                while (Character.isDigit(s.charAt(i))) {
                    if (i == s.length() - 1) {
                        break;
                    }
                    i++;
                }
            }
        }
        System.out.println("number of numbers per line: " + count);
    }
}
