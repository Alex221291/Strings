import java.util.Arrays;
import java.util.Scanner;
//10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
//знаком. Определить количество предложений в строке X.

public class Task10 {
    public static void main(String[] args)  {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter string:");
        String x = console.nextLine();
        String []proposal = x.split("[.!?]\\s*");
        System.out.println("number of proposals: " + proposal.length);
    }
}
