package se.lexicon.part2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now(); // Gets the current date
        System.out.println("currentDate: " + currentDate); // ISO format: YYYY-MM-DD

        LocalTime currentTime = LocalTime.now(); // Gets the current time
        System.out.println("currentTime: " + currentTime); // Format 10:22:27.267060200

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("currentDateTime: " + currentDateTime); // YYYY-MM-DDT10:22:27.267060200

        LocalDate specificDate = LocalDate.of(2025, 3, 10); // Create specific date
        System.out.println("specificDate:" + specificDate);

        String strBirthDate = "2022-02-25";
        LocalDate birthDate = LocalDate.parse(strBirthDate);
        System.out.println("birthDate: " + birthDate);

        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println("tomorrow: " + tomorrow);

        LocalDate nextWeek = LocalDate.now().plusWeeks(1);
        LocalDate nextMonth = LocalDate.now().plusMonths(1);

        LocalTime specificTime = LocalTime.of(9, 10);
        LocalTime specificTime2 = LocalTime.parse("09:00"); //HH:MM:SS

        LocalDate lectureDate = LocalDate.parse("2025-03-11"); //YYY-MM-DD
        System.out.println("ISO Date Format (default): " + lectureDate);
        String formattedDate = lectureDate.format(DateTimeFormatter.BASIC_ISO_DATE); // YYYYMMDD
        System.out.println("Basic ISO Date Format: " + formattedDate);

        String formattedDate2 =  lectureDate.format(DateTimeFormatter.ofPattern("eeee dd MM YYYY"));
        System.out.println("formattedDate2: " + formattedDate2);

        LocalDate date = LocalDate.parse("2020-01-01");
        System.out.println("2020 is a leap year: " + date.isLeapYear());

        // Period
        // Duration
        // ZoneId or TimeZone
    }
}
