package Examinations;
import java.time.LocalDate;

public abstract class Examination {

    // Both exams have date
    protected LocalDate date;
    public Examination(LocalDate date){
        this.date = date;
    }

    // display
//    public abstract String getBPdataforadmin();
//
//    public abstract String getMRIdataforadmin();

}
