package converter;

public class RomanToIntConverter {
    public int convert(String romanNumber) {
        int result = 0;
        char[] charArray = romanNumber.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            RomanDigit digit = RomanDigit.valueOf(String.valueOf(charArray[i]));
            int current = digit.getValue();
            if (RomanDigit.toReadNext(digit) && i < charArray.length - 1) {
                RomanDigit nextDigit = RomanDigit.valueOf(String.valueOf(charArray[++i]));
                if (RomanDigit.isSubtract(digit, nextDigit)) {
                    current = current - digit.getValue() + nextDigit.getValue() - digit.getValue();
                } else {
                    i--;
                }
            }
            result += current;
        }

        return result;
    }
}
