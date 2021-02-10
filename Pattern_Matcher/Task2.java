import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.Collections.frequency;
import static java.util.Collections.swap;
import static java.util.Comparator.comparingInt;
//2. Дана строка, содержащая следующий текст (xml-документ).
//Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий
//тег, закрывающий тег, содержимое тега, тег без тела).
// Пользоваться готовыми парсерами XML для решения данной задачи нельзя.

public class Task2 {
    public static void main(String[] args)  {
        String text = "<notes>" +
                        "<note id = \"1\">" +
                            "<to>Вася</to>" +
                            "<from>Света</from>" +
                            "<heading>Напоминание</heading>" +
                            "<body>Позвони мне завтра!</body>" +
                        "</note>" +
                        "<note id = \"2\">" +
                            "<to>Петя</to>" +
                                "<from>Маша</from>" +
                                "<heading>Важное напоминание</heading>" +
                                "<body/>" +
                            "</note>" +
                        "</notes>";
        analyzerXml(text);
    }
    public static void analyzerXml(String text) {
        String []regex = new String[]{"(<[^/].[^/]*?>)", "(</.+?>)", ">([^<].+?)<",">/.+?<"};
        String []type = new String[]{"\nOpening tags:", "\nClosing tags:", "\nThe body of the tag:","\nTags without a body:" };
        for (int i = 0; i < regex.length-1; i++) {
            Pattern pattern = Pattern.compile(regex[i]);
            Matcher matcher = pattern.matcher(text);
            System.out.println(type[i]);
            while(matcher.find()) {
                System.out.println(text.substring(matcher.start(1), matcher.end(1)));
            }

        }
        String textRev = new StringBuilder(text).reverse().toString();
        Pattern pattern = Pattern.compile(regex[3]);
        Matcher matcher = pattern.matcher(textRev);
        System.out.println(type[3]);
        while(matcher.find()) {
            System.out.println(new StringBuilder(textRev.substring(matcher.start(), matcher.end())).reverse().toString());
        }
    }
}
