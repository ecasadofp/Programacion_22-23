import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PruebasFechas {
    public static void main(String[] args) {

        DayOfWeek diaSemana = LocalDate.of(2023, Month.AUGUST,10).getDayOfWeek();
        System.out.println(diaSemana);


        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1492, Month.OCTOBER, 12);

        Period p = Period.between(birthday, today);
        System.out.println(p);
        long p2 = ChronoUnit.DAYS.between(birthday, today);
        System.out.println("You are " + p.getYears() + " years, " + p.getMonths() +
                " months, and " + p.getDays() +
                " days old. (" + p2 + " days total)");

    }

}
