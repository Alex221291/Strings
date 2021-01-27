import java.util.Scanner;
//3. Проверить, является ли заданное слово палиндромом.

public class Task3 {
    public static void main(String[] args)  {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter string");
        String s1 = console.nextLine();
        StringBuilder strBuilder = new StringBuilder(s1);
        strBuilder.reverse();
        String s2 = strBuilder.toString();
        if (s1.equals(s2)) {
            System.out.println("The string is a palindrome");
        }
        else {
            System.out.println("The string is not a palindrome");
        }
    }
}
