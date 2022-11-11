package introduktionTillProgrammeringUppgift;

public class Counter {
    private int numChars;
    private int row;
    public Counter(String textText, int totLines, int chars){
        numChars = chars;
        row = totLines;
    }
    public Counter() {

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
