import Examinations.BPexam;
import Examinations.MRIexam;
import Examinations.Examination;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;

public class StrokeInvestigation {
    public static void main(String[] args) {

        // Patient 1: Daphne Von Oram
        Patient patient1 = new Patient("Daphne Von Oram", 62,"http://martinh.netfirms.com/BIOE60010/DaphneVonOram.jpg" );
        patient1.addMRIexam(new MRIexam(LocalDate.of(2023,9,14),"https://martinh.netfirms.com/BIOE60010/mri1.jpg", 2));
       patient1.addBPexam(new BPexam(LocalDate.of(2023,9,15), "ST", 130, 70));

        // current problem is trying to reference from a static context: could continue to do something like the following but want a way to add data to the patient not have them exist seperately
        // Examination.MRIexam patient1MRIdata = new MRIexam(LocalDate.of(2023,9,14),"https://martinh.netfirms.com/BIOE60010/mri1.jpg", 2));



        // Patient 2: Sebastian Compton
        Patient patient2 = new Patient("Sebastian Compton", 31,"https://martinh.netfirms.com/BIOE60010/SebastianCompton.jpg" );
        patient2.addMRIexam(new MRIexam(LocalDate.of(2023,11,19),"https://martinh.netfirms.com/BIOE60010/mri2.jpg", 4));
        patient2.addBPexam(new BPexam(LocalDate.of(2023,11,20), "VST", 150, 80));


        // Create a Window to display the output based on the User

        // Administrator: technical log
        JFrame frame = new JFrame("Admin Log");
        frame.setSize(450,400);

        JPanel displayPanel = new JPanel();
        // Create a label for each patient's text
        JLabel displayLabel1 = new JLabel(patient1.getexamdataforadmin());

        displayPanel.add(displayLabel1);

        frame.setContentPane(displayPanel);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {// Ends program if close window is clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
