package com.archolding.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.MaskFormatter;

public class FechaUtil {

    private static MaskFormatter mascara;
    final private static SimpleDateFormat FORMAT = new SimpleDateFormat("dd/MM/yyyy");

    public static MaskFormatter getMascara() {
        try {
            mascara = new MaskFormatter("##/##/####");
            mascara.setPlaceholderCharacter('*');
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return mascara;
    }

    public static Date stringADateUtil(String s) {
        try {
            return FORMAT.parse(s);
        } catch (ParseException e) {
            return null;
        }
    }

    public static String dateUtilAString(Date d) {
        return FORMAT.format(d);
    }

}
