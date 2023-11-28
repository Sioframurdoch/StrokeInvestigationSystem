package Examinations;
import java.time.LocalDate;


public class MRIexam extends Examination {

    // MRI exams have an image URL, a date of examination, and a magnetic strength value (in Telsas)
    private LocalDate date;
    private String imageURL=new String();
    private int strength;

    public MRIexam(LocalDate date, String imageURL, int strength ){
        super(date);
        this.imageURL = imageURL;
        this.strength = strength;
    }

// ADD IN LOGIC TO DISPLAY

    // Admin display is a string
    public String getMRIdataforadmin() {
        return "MRI: " + strength +", on " + date.toString();
    }

    // Doctor display
}
