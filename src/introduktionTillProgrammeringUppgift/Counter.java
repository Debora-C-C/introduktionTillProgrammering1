package introduktionTillProgrammeringUppgift;

public class Counter {
    private int numChars;
    private int row;
    private int totNumWords;
    private String absolutLongest;
    private boolean stopInput;
    public Counter(int totLines, int chars, int totWords, String theLongest, boolean wordStop){
        numChars = chars;
        row = totLines;
        totNumWords = totWords;
        absolutLongest = theLongest;
        stopInput = wordStop;
    }
    public Counter() {

    }
    public void calcChars(String input) {
        numChars = numChars + input.length();
    }
    public void calcRows() {
        row = row + 1;
    }
    public void calcWords(String input) {
        String[] array = input.split(" ");
        int numWords = array.length;
        totNumWords = totNumWords + numWords;
    }
    public void calcLongestWord(String input) {
        String[] array = input.split(" ");
        String longest = "";

        int element = array[0].length();
        for (String s : array) {
            if (s.length() >= element && s.length() >= longest.length()) {
                element = s.length();
                longest = s;
            } else {
                longest = array[0];
            }
        }
        if (longest.length() > absolutLongest.length()){
            absolutLongest = longest;
        }
    }
    public void calcCheckStop(String input) {
        if(input.equals("stop")) {
            stopInput = true;
        }
        else {
            stopInput = false;
        }
    }
    public int getRowCount() {
        return row;
    }
    public int getNumCharsCount() {
        return numChars;
    }
    public int getNumWords() {
        return totNumWords;
    }
    public String getAbsolutLongestWord() {
        return absolutLongest;
    }
    public boolean getCheckStop() {
        return stopInput;
    }
}
