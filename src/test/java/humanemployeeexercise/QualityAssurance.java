package humanemployeeexercise;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@JobDescription(value = "testing")
public class QualityAssurance extends Employee {

    public QualityAssurance(String name, String title, ZonedDateTime birthDate, ZonedDateTime dateOfEmployment) {
        super(name, title, birthDate, dateOfEmployment);
    }

    public static void main(String[] args) {
        QualityAssurance qualityAssurance = new QualityAssurance("Ben", "operation", ZonedDateTime.of(LocalDate.of(1988, 11, 18), LocalTime.of(7, 30), ZoneId.of("Europe/Helsinki"))
                , ZonedDateTime.of(LocalDate.of(2005, 2, 15), LocalTime.of(9, 0), ZoneId.of("Europe/Helsinki")));
            System.out.println(qualityAssurance.getClass().getAnnotation(JobDescription.class).value());
    }
}
