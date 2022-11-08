package introduktionTillProgrammeringUppgift;

public class Counter {

    private String textInput;
    private int numChars;
    private int row;
    public Counter(String textText, int totLines, int chars){
        textInput = textText;
        numChars = chars;
        row = totLines;
    }
    public void calcChars(String input) {
        numChars = numChars + input.length();
        row = row + 1;

    }
    public int getRowCount() {

        return row;
    }
    public int getNumCharsCount() {

        return numChars;
    }
}
