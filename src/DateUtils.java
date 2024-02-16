import java.text.SimpleDateFormat;
import java.util.Date;


//public class DateUtils {
//    public static String formatDateForDisplay(Date date) {
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        return sdf.format(date);
//    }
//
//    public static String formatTimeForDisplay(Date date) {
//        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
//        return sdf.format(date);
//    }
//
//
//    public static String formatDateTimeForDisplay(Date date) {
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//        return sdf.format(date);
//    }
//}

public class DateUtils {
    public static String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(date);
    }

    public static String formatTime(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(date);
    }


    public static String formatDnT(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return sdf.format(date);
    }
}