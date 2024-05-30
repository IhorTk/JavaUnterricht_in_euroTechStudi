package day_20_random_math;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class lesData {
    public static void main(String[] args) {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);

        Date date1 = new  Date( 2024, 02,24);
        System.out.println(date1);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate localDate1 = LocalDate.of(2020, 03, 28);
        System.out.println(localDate1);

        LocalTime time1 = LocalTime.now();
        System.out.println(time1);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate date2 = LocalDate.of(2024,02,25);
        LocalDate date3 = LocalDate.of(2022,02,24);
        long raznicaPoDatam = ChronoUnit.DAYS.between(date2,date3);
        System.out.println(raznicaPoDatam);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");
        LocalDateTime localDateTime1 = LocalDateTime.now();
        System.out.println(" Обычная дата :  " + localDateTime1);
        String format = localDateTime1.format(formatter);
        System.out.println(" Отформатированная дата и время :  " + format);

    }
}
