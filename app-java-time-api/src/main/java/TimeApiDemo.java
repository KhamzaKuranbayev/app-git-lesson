import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Set;

/**
 * Author: khamza@nightwell-logistics.com
 * Date: 6/30/2022
 * Time: 8:51 PM
 */
public class TimeApiDemo {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);

        /*Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        for (String availableZoneId : availableZoneIds) {
            System.out.println(availableZoneId);
        }
        System.out.println();*/
        /*ZonedDateTime zonedDateTimeTashkent = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Asia/Tashkent"));
        ZonedDateTime zonedDateTimeDubai = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Asia/Dubai"));

        System.out.println(zonedDateTimeTashkent);
        System.out.println(zonedDateTimeDubai);*/


//        LocalDate localDate = LocalDate.now();
        LocalDate localDate = LocalDate.of(2022, 5, 15);
//        System.out.println(localDate);

        LocalDate localDate1 = LocalDate.of(2022, Month.MAY, 03);
//        System.out.println(localDate1);

        LocalDate localDate2 = LocalDate.parse("2022-05-15");
//        System.out.println(localDate2);

        LocalDate localDate3 = LocalDate.parse("05/15/2022", DateTimeFormatter.ofPattern("MM/dd/yyyy"));
//        System.out.println(localDate3);

        LocalDate localDate4 = LocalDate.parse("2022-05-15").plus(5, ChronoUnit.MONTHS);
//        System.out.println(localDate4);

        DayOfWeek dayOfWeek = LocalDate.parse("2022-06-30").plus(1, ChronoUnit.YEARS).getDayOfWeek();
//        System.out.println(dayOfWeek);

        // isBefore
        // isAfter

        boolean isBefore = LocalDate.parse("2022-06-01").isBefore(LocalDate.parse("2022-06-01"));
//        System.out.println(isBefore);

        boolean isAfter = LocalDate.parse("2022-06-01").isEqual(LocalDate.parse("2022-06-01"));
//        System.out.println(isAfter);


        // LocalTime
        LocalTime localTime = LocalTime.now();
//        System.out.println(localTime);

        LocalTime localTime1 = LocalTime.of(11, 25, 3);
//        System.out.println(localTime1);

        LocalTime parse = LocalTime.parse("05:25");
//        System.out.println(parse);

        LocalTime localTime2 = LocalTime.parse("12:35:50").minusHours(10);
//        System.out.println(localTime2);

        boolean before = LocalTime.parse("06:25").isBefore(LocalTime.parse("07:25"));
//        System.out.println(before);

        LocalDateTime localDateTime1 = LocalDateTime.parse("2022-06-30T21:50:10").plus(10, ChronoUnit.DAYS);
//        System.out.println(localDateTime1);


//        Period
//        Duration

        Period period = Period.ofDays(5);
//        System.out.println(period.getDays());

        /*Period period1 = Period.between(LocalDate.parse("2021-01-01"), LocalDate.parse("2022-06-30"));
        System.out.println(period1.getYears());
        System.out.println(period1.getMonths());
        System.out.println(period1.getDays());*/

        long toTotalMonths = Period.between(LocalDate.parse("2021-01-01"), LocalDate.parse("2022-06-30")).toTotalMonths();

        Duration duration = Duration.between(LocalTime.parse("17:00"), LocalTime.parse("22:00"));
//        System.out.println(duration.get(ChronoUnit.SECONDS));

        LocalDateTime localDateTime2 = LocalDateTime.now();
    }
}
