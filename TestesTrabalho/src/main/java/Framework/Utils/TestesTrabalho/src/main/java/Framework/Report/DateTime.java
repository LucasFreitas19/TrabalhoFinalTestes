package Framework.Report;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {

        public static String getDateTimeFormat(){

            SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss");
            Date now = new Date();
            return s.format(now);
        }
    }

