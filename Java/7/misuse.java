package rbot.util.Math;
import java.awt.Point;

public final class Calculator {
    public final static int BASE_10 = 10;
    public static double round(final double number, 
		final int decimalPlace) {
        double decimalCorrectFact = Math.pow(BASE_10, decimalPlace);
        return Math.round(decimalCorrectFact * number) / 
		   decimalCorrectFact;
    }
}
