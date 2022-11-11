package introduktionTillProgrammeringUppgift;

import java.util.Scanner;

public class JavaAssignment {

    public static void main(String[] args) {

        System.out.println("Please write something :)");

        Scanner scan = new Scanner(System.in);
        String textInput = scan.nextLine();

        int numChars = 0;
        int row = 0;

        Counter calc = new Counter(textInput, numChars, row);

        while (!textInput.equals("stop")) {
            calc.calcChars(textInput);
            numChars = calc.getNumCharsCount();
            row = calc.getRowCount();


            textInput = scan.nextLine();
        }
        System.out.println("Hello! This is the result you get:");
        System.out.println("You wrote a total of: " + numChars + " chars. And");
        System.out.println("a total of: " + row +" rows. Thank you!");
    }

}
