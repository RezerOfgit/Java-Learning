package com.rezero.date_;

import javafx.beans.binding.Bindings;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Re-zero
 * @version 1.0
 */
public class LocalDate01 {
    public static void main(String[] args) {
        //第三代日期
        //解读
        //1. 使用now() 返回表示当前日期时间的 对象
        LocalDateTime ldt =LocalDateTime.now(); //LocaLDate.now();//LocaLTime.now()
        System.out.println(ldt);

        //2.使用 DateTimeFormatter 对象来进行格式化
        //创建 DateTimeFormatter 对象
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:s");
        String format = dateTimeFormatter.format(ldt);
        System.out.println("格式化的目期=" + format);
        System.out.println("年=" + ldt.getYear());
        System.out.println("月=" + ldt.getMonth());
        System.out.println("月=" + ldt.getMonthValue());
        System.out.println("日=" + ldt.getDayOfMonth());
        System.out.println("时=" + ldt.getHour());
        System.out.println("分=" + ldt.getMinute());
        System.out.println("秒=" + ldt.getSecond());
        LocalDate now1 = LocalDate.now();//可以获取年月日
        LocalTime now2 = LocalTime.now();//获取到时分秒

        //提供 plus 和 minus 方法可以对当前时间进行加或者减
        //看看 890天后，是什么时候 把 年月日-时分秒
        LocalDateTime localDateTime = ldt.plusDays(890);
        System.out.println("890 天后 = " + dateTimeFormatter.format(localDateTime));
        //System.out.println("890 天后=" + dateTimeFormatter.format(localDateTime));
        //看看在 3456 分钟前是什么时候，把 年月日-时分秒输出
        LocalDateTime localDateTime2 = ldt.minusMinutes(3456);
        System.out.println("3456 分钟前 日期=" + dateTimeFormatter.format(localDateTime2));
    }
}
