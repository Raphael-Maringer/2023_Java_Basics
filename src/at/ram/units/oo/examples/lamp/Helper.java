package at.ram.units.oo.examples.lamp;

import java.text.DecimalFormat;


public class Helper {
    public static String format(double value) {
        String pattern = "#,##0.0#";
        return new DecimalFormat(pattern).format(value);
    }
}
