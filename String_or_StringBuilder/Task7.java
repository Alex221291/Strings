import java.util.Scanner;
//7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
//def", то должно быть выведено "abcdef".

public class Task7 {
    public static void main(String[] args)  {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter string:");
        String s = console.nextLine();
        for (int i = s.length() - 1; i >= 0; i--) {
            if(s.indexOf(s.charAt(i)) != s.lastIndexOf(s.charAt(i))) {
                s = s.substring(0, i) + s.substring(i+1);
            }
        }
        s = s.replaceAll(" ", "");
        System.out.println("A string with no duplicate characters and no spaces:");
        System.out.println(s);
    }
}
