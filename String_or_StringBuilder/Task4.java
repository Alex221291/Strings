import java.util.Scanner;
//4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.

public class Task4 {
    public static void main(String[] args)  {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter string");
        String s1 = new String("информатика");
        String s2 = s1.charAt(7) + s1.substring(3, 5) + s1.charAt(7);
        System.out.println(s2);
    }
}
