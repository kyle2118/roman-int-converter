package converter;

public enum RomanDigit {
    I(1), V(5),
    X(10), L(50),
    C(100), D(500),
    M(1000);

    private int value;
    RomanDigit(int value) {
        this.value = value;
    }

    public static boolean toReadNext(RomanDigit digit) {
        return I.equals(digit) || X.equals(digit) || C.equals(digit);
    }
    public static boolean isSubtract(RomanDigit one, RomanDigit two) {
        if (one == I && (two == V || two == X)) {
            return true;
        }
        if (one == X && (two == L || two == C)) {
            return true;
        }
        return one == C && (two == D || two == M);
    }

    public int getValue() {
        return value;
    }
}
