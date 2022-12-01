package ua.example.reference3ds.util;

public class LibUtil {

    public static String formatAmount(double amt, Integer exp) {
        if (exp == null) {
            exp = 2;
        }

        return String.format("%0" + (exp > 0 ? 13 : 12) + "." + exp + "f", amt).replaceAll("\\D", "");
    }

}
