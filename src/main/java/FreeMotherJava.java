public class FreeMotherJava {

    public int biggestDifferentDigitNumber(int i) {
        int toReturn;
        final int BASE = 10;
        
        if (i == 1) {
            toReturn = 9;
        } else {
            toReturn = BASE * (biggestDifferentDigitNumber(i - 1) + 1) - i;
        }

        return toReturn;
    }

    public int rightToLeft(int i) {
        int toReturn;
        String stringNumber = String.valueOf(i);
        char[] charNumbers = stringNumber.toCharArray();
        StringBuilder resultStringNumber = new StringBuilder();
        for (char charNumber : charNumbers) {
            resultStringNumber.insert(0, charNumber);
        }
        toReturn = Integer.parseInt(resultStringNumber.toString());
        return toReturn;
    }

    public boolean isSquareNumber(int i) {
        int root = (int) Math.sqrt(i);
        int power = (int) Math.pow(root, 2);
        return i==power;
    }
}