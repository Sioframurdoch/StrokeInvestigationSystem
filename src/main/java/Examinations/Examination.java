package Examinations;
import java.time.LocalDate;

public class Examination {

    // Date common to all appointments
    protected LocalDate date;
    public Appointment(LocalDate date){
        this.date = date;
    }
    public abstract String getDisplayText();

}
