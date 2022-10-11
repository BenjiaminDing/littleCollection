package 日历;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * created   CalendarDemo  by benjiamin at 2022/6/11 / 17:19 /19
 */
public class CalendarDemo {

        public void getCalendar() {
            Date date = new Date();
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);

            cal.add(Calendar.MONTH, -1);

            SimpleDateFormat sdfYear = new SimpleDateFormat("yyyy");
            SimpleDateFormat sdfMonth = new SimpleDateFormat("MM");
            SimpleDateFormat sdfDate = new SimpleDateFormat("dd");

            int dateNum = Integer.parseInt(sdfDate.format(date));

            String month = sdfMonth.format(cal.getTime());
            String year = sdfYear.format(cal.getTime());

            System.out.println(month);
            System.out.println(year);
            System.out.println(dateNum);


            }

    public static void main(String[] args) {
        CalendarDemo cal = new CalendarDemo();
        cal.getCalendar();
    }

}




 class DateTestUtil {

    public static void main(String[] args) throws Exception {

        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");

        String str="20110823";

        Date dt=sdf.parse(str);
        System.out.println("res::"+dt);

        Calendar rightNow = Calendar.getInstance();

        rightNow.setTime(dt);

        rightNow.add(Calendar.YEAR,-1);//日期减1年

        rightNow.add(Calendar.MONTH,3);//日期加3个月

        rightNow.add(Calendar.DAY_OF_YEAR,10);//日期加10天

        Date dt1=rightNow.getTime();

        String reStr = sdf.format(dt1);

        System.out.println(reStr);

    }

 static   class DateStr{

    }

}
