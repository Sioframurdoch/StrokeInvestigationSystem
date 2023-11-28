package Examinations;
import java.time.LocalDate;


public class BPexam extends Examination {

    private LocalDate date;
    private String measurelength=new String();
    private int systolic;

    private int diastolic;

    public BPexam(LocalDate date, String measurelength, int systolic, int diastolic ){
        super(date);
        this.measurelength = measurelength;
        this.systolic = systolic;
        thi.diastolic = diastolic;

}

// ADD IN DISPLAY LOGIC