import Examinations.examination;
import Examination.BPexam;
import Examination.MRIexam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Patient {

    // Patients have a name, a picture (given by a URL), an age and details of their MRI and BP exams
    private final String name;
    private int age;

    private String pictureURL;

    private ArrayList<Examination> examdata = new ArrayList<Examination>();
    public Patient(String name, int age, String pictureURL){
        this.name = name;
        this.age = age;
        this.pictureURL = pictureURL;
    }

    // Add MRI exam information for a patient
    public void addMRIexam (MRIexam MRIexamdata){
        MRIexam.add(MRIexamdata);
    }

    // Add BP exam information for a patient
    public void addBPexam (BPexam BPexamdata){
        BPexam.add(BPexamdata);
    }

    // TO DO
    public String getexamdata(){

        // Get the exam data for this patient
        // Surround with <html></html> tags so it can be displayed in a JLabel with <br> to make newlines
        // Note - if printing to the console instead, use \n instead of <br>

        String display=new String("<html>");
        display+="Patient: "+name+"<br>";
        display+=initialAppointment.getDisplayText();
        for(Vaccine vax:vaccines){
            List<Appointment> appts=vax.getAppointments();
            for (Appointment apt:appts){
                display+=apt.getDisplayText();
            }
        }
        return display+"<br></html>";
    }
}
