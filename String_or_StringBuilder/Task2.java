import java.util.Scanner;
//2. В строке вставить после каждого символа 'a' символ 'b'.

public class Task2 {
    public static void main(String[] args)  {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter string");
        String s = console.next();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a') {
                s = s.substring(0, i+1) + "b" + s.substring(i+1);
            }
        }
        System.out.println(s);
    }
}
