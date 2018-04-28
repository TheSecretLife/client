package utilities;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ExpireItemSystem {
   public static String getCalDay(String myday) {
      DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
      Calendar cal = Calendar.getInstance();
      cal.add(5, Integer.parseInt(myday));
      return dateFormat.format(cal.getTime());
   }

   public static String getCalHour(String myday) {
      DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
      Calendar cal = Calendar.getInstance();
      cal.add(11, Integer.parseInt(myday));
      return dateFormat.format(cal.getTime());
   }

   public static String getCalSecond(String myday) {
      DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
      Calendar cal = Calendar.getInstance();
      cal.add(13, Integer.parseInt(myday));
      return dateFormat.format(cal.getTime());
   }

   public static Boolean getCheckDate(String myday) {
      if (myday.matches(" ") && myday.matches("")) {
         return false;
      } else {
         try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            String timeStamp = (new SimpleDateFormat("dd/MM/yyyy HH:mm:ss")).format(Calendar.getInstance().getTime());
            Date date1 = sdf.parse(timeStamp);
            Date date2 = sdf.parse(myday);
            if (date1.after(date2)) {
               return true;
            }

            if (date1.before(date2)) {
               return false;
            }

            if (date1.equals(date2)) {
               return true;
            }
         } catch (ParseException var5) {
            var5.printStackTrace();
         }

         return false;
      }
   }

   public static String getCalMonth(String myday) {
      DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
      Calendar cal = Calendar.getInstance();
      cal.add(2, Integer.parseInt(myday));
      return dateFormat.format(cal.getTime());
   }

   public static String getCalMinute(String myday) {
      DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
      Calendar cal = Calendar.getInstance();
      cal.add(12, Integer.parseInt(myday));
      return dateFormat.format(cal.getTime());
   }
}
