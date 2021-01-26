import java.util.Scanner;
//1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

public class Task1 {
    public static void main(String[] args)  {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter length array A: ");
        String []a = new String[console.nextInt()];
        System.out.println("Enter equals array A: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = console.next();
        }
        System.out.println("array A camelCase");
        printArray(a);
        a = snakeCase(a);
        System.out.println("array A snake_case");
        printArray(a);

    }
    public static String[] snakeCase(String []arr)
    {
        String []sC = arr;
        for (int i = 0; i < sC.length; i++) {
            for (int j = 1; j < sC[i].length(); j++) {
                if(Character.isUpperCase(sC[i].charAt(j))) {
                    sC[i] = sC[i].substring(0,j) + "_" + sC[i].substring(j);
                    j++;
                }
            }
            sC[i] = sC[i].toLowerCase();
        }
        return  sC;
    }
    public static void printArray(String [] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("");
    }
}
