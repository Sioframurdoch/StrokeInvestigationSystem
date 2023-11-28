package Examinations;
import java.time.LocalDate;


public class MRIexam extends Examination {
    private LocalDate date;
    private String imageURL=new String();
    private int strength;

    public MRIexam(LocalDate date, String imageURL, int strength ){
        super(date);
        this.imageURL = imageURL;
        this.strength = strength;

}


// ADD IN LOGIC TO DISPLAY
    public String getDisplayText(){
        return "Appointment on "+date.toString() +" with administrator at "+location+"<br>";

}
