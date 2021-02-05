import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.Collections.frequency;
import static java.util.Collections.swap;
import static java.util.Comparator.comparingInt;
//1. Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
//операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
//отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
//алфавиту.

public class Task {
    public static void main(String[] args)  {
        String text = "Регулярные выражения — тема, которую программисты, даже опытные, зачастую откладывают на потом. " +
                "Однако большинству Java-разработчиков рано или поздно придётся столкнуться с обработкой текстовой информации. " +
                "Чаще всего — с операциями поиска в тексте и редактированием. Без регулярных выражений продуктивный и компактный программный код, " +
                "связанный с обработкой текстов, попросту немыслим. Так что хватит откладывать, разберёмся с «регулярками» прямо сейчас. " +
                "Это не такая уж и сложная задача.\n" +
                "Что такое регулярное выражение RegEx?\n" +
                "На самом деле регулярное выражение (RegEx) – это шаблон для поиска строки в тексте. " +
                "В Java исходным представлением этого шаблона всегда является строка, то есть объект класса String. " +
                "Однако не любая строка может быть скомпилирована в регулярное выражение, а только та, " +
                "которая соответствует правилам написания регулярного выражения – синтаксису, " +
                "определенному в спецификации языка.\n";
        ArrayList<String> proposals = sortByNumberOfSentencesInParagraph(text);
        System.out.println("\n1. Sort by the number of sentences in a paragraph:");
        printArrayList(proposals);
        ArrayList<String> sortOfWords = sortByLengthOfWord(text);
        System.out.println("\n2. Words in a sentence sorted by length:");
        printArrayList(sortOfWords);
        ArrayList<String> toFindSymbol = sortByFrequencySymbol(text, 'а');
        System.out.println("\n3. Sort by the number of repetitions of letters in words:");
        printArrayList(toFindSymbol);
    }
    public static ArrayList<String> paragraph(String text) {
        ArrayList<String> list = new ArrayList<String>();
        Pattern pattern = Pattern.compile(".+\n");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            list.add(text.substring(matcher.start(), matcher.end()));
        }
        return list;
    }
    public static ArrayList<String> proposals(String text) {
        ArrayList<String> list = new ArrayList<String>();
        Pattern pattern = Pattern.compile("([^.!?]+)");;
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            list.add(text.substring(matcher.start(), matcher.end()));
        }
        return list;
    }
    public static ArrayList<String> words(String text) {
        ArrayList<String> list = new ArrayList<String>();
        Pattern pattern = Pattern.compile("([^\\s]+)");;
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            list.add(text.substring(matcher.start(), matcher.end()));
        }
        return list;
    }
    public static ArrayList<String> sortByFrequencySymbol(String text, char toFind) {
        ArrayList<String> list = proposals(text);
        for (int i = 0; i < list.size(); i++) {
            ArrayList<String> bufProposal = words(list.get(i));
            for (int j = 1; j < bufProposal.size(); j++){
                if ((frequencySymbolOfWord(bufProposal.get(j-1), toFind) < frequencySymbolOfWord(bufProposal.get(j), toFind)) ||
                        (frequencySymbolOfWord(bufProposal.get(j-1), toFind) == frequencySymbolOfWord(bufProposal.get(j), toFind) && bufProposal.get(j-1).toLowerCase().compareTo(bufProposal.get(j).toLowerCase()) > 0)) {
                    swap(bufProposal, j - 1, j);
                    if (j > 1) {
                        j -= 2;
                    } else {
                        j--;
                    }
                }
            }
            list.set(i, String.join(" ", bufProposal));
        }
        return list;
    }
    public static int frequencySymbolOfWord(String word, char symbol) {
        int count = 0;
        word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == symbol) {
                count++;
            }
        }
        return count;
    }
    public static ArrayList<String> sortByLengthOfWord(String text) {
        ArrayList<String> list = proposals(text);
        for (int i = 0; i < list.size(); i++) {
            ArrayList<String> bufProposal = words(list.get(i));
            for (int j = 1; j < bufProposal.size(); j++) {
                if (bufProposal.get(j-1).length() > bufProposal.get(j).length()) {
                    swap(bufProposal, j - 1, j);
                    if (j > 1) {
                        j -= 2;
                    } else {
                        j--;
                    }

                }
            }
            list.set(i, String.join(" ", bufProposal));
        }
        return list;
    }
    public static ArrayList<String> sortByNumberOfSentencesInParagraph(String text) {
        ArrayList<String> list = paragraph(text);

        for (int i = 1; i < list.size(); i++) {
            if (proposals(list.get(i-1)).size() < proposals(list.get(i)).size()) {
                swap(list, i-1, i);
                if (i > 1){
                    i -= 2;
                }
                else {
                    i--;
                }

            }
        }
        return list;
    }
    public static void printArrayList(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            int j = list.size() - i - 1;
            System.out.println(list.get(j));
        }
    }
}
