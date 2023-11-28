import Examinations.BPexam;
import Examinations.MRIexam;
import Examinations.Examination;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Patient {

    // Patients have a name, a picture (given by a URL), an age and details of their MRI and BP exams
    private final String name;
    private int age;
    private String pictureURL;

    // Create array lists to store patient examination data
    private ArrayList<Examination> MRIdata = new ArrayList<Examination>();
    private ArrayList<Examination> BPdata = new ArrayList<Examination>();


    public Patient(String name, int age, String pictureURL){
        this.name = name;
        this.age = age;
        this.pictureURL = pictureURL;
    }

    // Add MRI exam information for a patient
    public void addMRIexam (Examination MRIexam){
        MRIdata.add(MRIexam);
    }

    // Add BP exam information for a patient
    public void addBPexam (Examination BPexam){
        BPdata.add(BPexam);
    }

    // get the data for display

    public String getexamdataforadmin(){

        // Get the exam data for this patient for an admin (admins want to see: patient name and exam details)

        String display=new String("<html>");
        display+="Patient: "+name+"<br>";
        display+= MRIexam.getMRIdataforadmin();
        display+= BPexam.getBPdataforadmin();


//        for(Vaccine vax:vaccines){
//            List<Appointment> appts=vax.getAppointments();
//            for (Appointment apt:appts){
//                display+=apt.getDisplayText();
//            }
//      }
        return display+"<br></html>";
    }
}
