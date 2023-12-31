package LeetCode;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solition {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = sdformat.parse("2019-04-15");
        Date d2 = sdformat.parse("2019-02-10");
        System.out.println("The date 1 is: " + sdformat.format(d1));
        System.out.println("The date 2 is: " + sdformat.format(d2));
        if(d1.compareTo(d2) > 0) {
            System.out.println("Date 1 occurs after Date 2");
        } else if(d1.compareTo(d2) < 0) {
            System.out.println("Date 1 occurs before Date 2");
        } else if(d1.compareTo(d2) == 0) {
            System.out.println("Both dates are equal");
        }
    }

}
