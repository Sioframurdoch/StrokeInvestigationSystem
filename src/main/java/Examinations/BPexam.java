package Examinations;
import java.time.LocalDate;


public class BPexam extends Examination {

    // BPexams have a systolic pressure value, diastolic pressure value, date, and "VST" or "ST" indicating measurement length
    private LocalDate date;
    private String measurelength=new String();
    private int systolic;

    private int diastolic;

    public BPexam(LocalDate date, String measurelength, int systolic, int diastolic ){
        super(date);
        this.measurelength = measurelength;
        this.systolic = systolic;
        this.diastolic = diastolic;

}

// ADD IN DISPLAY LOGIC