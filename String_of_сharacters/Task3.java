import java.util.Scanner;
//3. В строке найти количество цифр.

public class Task3 {
    public static void main(String[] args)  {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter string S: ");
        String s = console.next();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                count++;
            }
        }
        System.out.println("number of digits per line: " + count);
    }
}
