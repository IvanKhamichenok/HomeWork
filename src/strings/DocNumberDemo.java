package strings;

public class DocNumberDemo {

        public static void main(String[] args) {
            String docNumber =  "1111-aaa-2222-bbb-3c3d";
            System.out.println("Исходная строка: " + docNumber);

            DocumentNumber.printFirstTwoBlocks(docNumber);
            DocumentNumber.printThreeLettersBlocksAsStars(docNumber);
            DocumentNumber.printOnlyLettersRegex(docNumber);
            DocumentNumber.printOnlyLetters(docNumber);
            DocumentNumber.containsAbc(docNumber);

            DocumentNumber.isWordPalindrome("andna", 0);
            DocumentNumber.findWordWithMinOfDiffSymbols("fffff ab f 1234 jkjk");
        }
    }

