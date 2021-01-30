import java.util.Arrays;
import java.util.Scanner;
//8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
//длинных слов может быть несколько, не обрабатывать.

public class Task8 {
    public static void main(String[] args)  {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter string:");
        String s = console.nextLine();
        String []words = s.split("\\s+");
        String maxWord =  words[0];
        for (int i = 0; i < words.length; i++) {
            if(maxWord.length() < words[i].length()) {
                maxWord = words[i];
            }
        }
        System.out.println("Longest word in a string: " + maxWord);
    }
}
