package ghost.example.conversion;

import java.util.Scanner;
import java.lang.String;
import java.lang.Integer;

public class ConvertingPoundsToBritishPounds {

    public static double usdollarToCanadian(double usd) {

        double result;
        result = usd * 1.34;
        return result;
    }

    public static double usdollarToEuro(double usd) {
        double output;
        output = usd * 0.88;
        return output;
    }
}
