package strings;
import java.util.Arrays;
public class DocumentNumber {

            //Вывести на экран в одну строку два первых блока по 4 цифры.
    public static void printFirstTwoBlocks(String docNumber) {

                String s = "1111-aaa-2222-bbb-3c3d";
                int start = 0;
                int end = 4;
                char[] buf = new char[end - start];
                s.getChars(start, end, buf, 0);
                int start_two = 9;
                int end_two = 13;
                char[] buf_two = new char[end_two - start_two];
                s.getChars(start_two, end_two, buf_two, 0);
                System.out.println(Arrays.toString(buf) + Arrays.toString(buf_two));}

    public static void printThreeLettersBlocksAsStars(String docNumber) {
        //Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *)
        String s = "1111-aaa-2222-bbb-3c3d";
        String s1 = s.replace('a', '*');
        String s2 = s1.replace('b', '*');
        System.out.println(s2);}
    public static void printOnlyLettersRegex(String docNumber) {
        //Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре
            String input = "1111-aaa-2222-bbb-3c3d";
            String sr = input.replaceAll("\\d{4}-|\\d", "");
            String sr1= sr.replaceAll("-", "/");
            sr1 = new StringBuilder(sr1).insert(sr1.length() - 1, "/").toString();
            System.out.println(sr1);}
    public static void printOnlyLetters(String docNumber) {
        //Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y",
        // в верхнем регистре(реализовать с помощью класса StringBuilder).
        String input = "1111-aaa-2222-bbb-3c3d";
        String sr = input.replaceAll("\\d{4}-|\\d", "");
        String sr1= sr.replaceAll("-", "/");
        sr1 = new StringBuilder(sr1).insert(sr1.length() - 1, "/").toString();
            StringBuilder builder = new StringBuilder(sr1.toUpperCase());
            System.out.println("Letters:" + builder);}

    public static boolean containsAbc(String docNumber) {
        //Проверить содержит ли номер документа последовательность abc и вывести сообщение содержит или нет
        // (причем, abc и ABC считается одинаковой последовательностью).
        if (docNumber.toLowerCase().contains("abc")) {
            System.out.println("Number contains \"abc\"");
            return true;
        } else {
            System.out.println("Number doesn't contain \"abc\"");
            return false;
        }
    }


    public static String findWordWithMinOfDiffSymbols(String string) {
        // Дана строка произвольной длины с произвольными словами.Найти слово,
        // в котором число различных символов минимально. Словоможет содержать буквы и цифры.
        // Если таких слов несколько, найти первое из них.Например, в строке "fffff ab f 1234 jkjk"
        // найденное слово должно быть "fffff".
        System.out.println("Исходная строка: " + string);
        String[] words = string.split(" ");
        int[] uniqueSymbolsCount = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            StringBuilder buffer = new StringBuilder();
            char[] chars = words[i].toCharArray();
            for (char symbol : chars) {
                if (!buffer.toString().contains(String.valueOf(symbol))) {
                    buffer.append(symbol);
                }
            }
            uniqueSymbolsCount[i] = buffer.toString().length();
        }
        int min = uniqueSymbolsCount[0];
        int index = 0;
        for (int i = 0; i < uniqueSymbolsCount.length; i++) {
            if (min > uniqueSymbolsCount[i]) {
                min = uniqueSymbolsCount[i];
                index = i;
            }
        }
        System.out.println("Cлово, в котором число различных символов минимально: " + words[index]);
        return words[index];
    }


    public static boolean isWordPalindrome(String string, int number) {
        //  Дана строка произвольной длины с произвольными словами.Написать программу
        //  для проверки является ли любое выбранное слово встроке палиндромом.Например,
        //  есть строка, вводится число 3, значит необходимо проверитьявляется ли 3-е слово в этой строке палиндромом.
        //Предусмотреть предупреждающие сообщения на случаи ошибочных
        //ситуаций: например, в строке 5 слов, а на вход программе передали число
        // 500 и т. п. ситуации.

        String[] words = string.split(" ");
        if (words.length <= number || number < 0) {
            System.out.println("Invalid index");
            return false;
        } else {
            String chosenWord = words[number];
            boolean isPalindrome = chosenWord.equals(new StringBuilder(chosenWord).reverse().toString());
            if (isPalindrome) {
                System.out.println("Word \"" + chosenWord + "\" is palindrome");
            } else {
                System.out.println("Word \"" + chosenWord + "\" is not palindrome");
            }
            return isPalindrome;
        }
    }
}