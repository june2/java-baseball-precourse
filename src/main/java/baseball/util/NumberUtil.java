package baseball.util;

public class NumberUtil {
    public static boolean isAllowNumeric(String strNum) {
        Double num;
        if (strNum == null) {
            return false;
        }
        try {
            num = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }

        if (num < 111) {
            return false;
        }

        return true;
    }
}
