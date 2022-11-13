package introduktionTillProgrammeringUppgift;

import java.util.Scanner;

public class JavaAssignment {

    public static void main(String[] args) {

        System.out.println("Please write something :)");

        Scanner scan = new Scanner(System.in);
        String textInput = scan.nextLine();

        int numChars = 0;
        int row = 0;
        int totNumWords = 0;
        String absolutLongest = " ";
        boolean stopInput = false;

        Counter calc = new Counter(numChars, row, totNumWords, absolutLongest, stopInput);
        calc.calcCheckStop(textInput);
        stopInput = calc.getCheckStop();

        while (!stopInput) {
            calc.calcChars(textInput);
            numChars = calc.getNumCharsCount();
            calc.calcRows();
            row = calc.getRowCount();
            calc.calcWords(textInput);
            totNumWords = calc.getNumWords();
            calc.calcLongestWord(textInput);
            absolutLongest = calc.getAbsolutLongestWord();

            textInput = scan.nextLine();
            calc.calcCheckStop(textInput);
            stopInput = calc.getCheckStop();
        }
        System.out.println("Hello! This is the result you get:");
        System.out.println("You wrote a total of: " + numChars + " chars.");
        System.out.println("A total of: " + row +" rows.");
        System.out.println("A total of: "+ totNumWords + " words");
        System.out.println("And the longest word is: "+ absolutLongest);
    }

}
