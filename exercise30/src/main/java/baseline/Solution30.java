package baseline;

public class Solution30 {

    public static void main(String[] args) {

        Solution30 app = new Solution30();

        System.out.print(app.getFull());

    }

    public String getFull() {
        String fullString = "";

        for(int i = 1; i <= 12; i++) {
            // add getRow(i) and new line to fullString
            fullString += getRow(i) + "\n";
        }

        return fullString;
    }

    public String getRow(int row) {
        String rowString = "";

        // for loop from 0 to 12 inclusive (index i)
        for(int i = 1; i <= 12; i++) {
            // add spacing(row * i) to rowString
            rowString += spacing(row * i);
        }
        return rowString;
    }

    public String spacing(int value) {
        int count;
        String spacedNum = "";

        count = getDigitCount(value);

        // for 0 to (5 - count)
        for(int i = 0; i < 5 - count; i++) {
            // add space to spacedNum
            spacedNum += " ";
        }
        spacedNum += value;

        return spacedNum;
    }

    public int getDigitCount(int value) {
        int count = 0;

        while(value > 0) {
            value /= 10;
            count++;
        }
        return count;
    }
}
