import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
//буквы.

public class Task9 {
    public static void main(String[] args)  {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter string:");
        String s = console.nextLine();
        int quantityUppercaseLetters = 0;
        int quantityLowercaseLetters = 0;
        for (int i = 0; i < s.length(); i++) {
            String symbol = s.charAt(i) + "";
            Pattern patlatletter = Pattern.compile("[a-zA-Z]{1}");
            Matcher matlatletter = patlatletter.matcher(symbol);
            if (matlatletter.matches()) {
                if (Character.isUpperCase(s.charAt(i))) {
                    quantityUppercaseLetters++;
                } else quantityLowercaseLetters++;
            }
        }
        System.out.println("number of lowercase letters: " + quantityLowercaseLetters);
        System.out.println("number of uppercase letters: " + quantityUppercaseLetters);
    }
}
