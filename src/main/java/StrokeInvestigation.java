import Examinations.BPexam;
import Examinations.MRIexam;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;

public class StrokeInvestigation {
    public static void main(String[] args) {

        // Patient 1: Daphne Von Oram
        Patient patient1 = new Patient("Daphne Von Oram", 62,"http://martinh.netfirms.com/BIOE60010/DaphneVonOram.jpg" );
        patient1.addMRIexam(new MRIexam(LocalDate ld= LocalDate.of(2023,9,14),"https://martinh.netfirms.com/BIOE60010/mri1.jpg", 2));
        patient1.addBPexam(new BPexam(LocalDate ld1 = LocalDate.of(2023,9,15), "ST", 130, 70));


        // Create a Window to display the output based on the User
        JFrame frame = new JFrame("Appointments");
        frame.setSize(450,400);

        JPanel displayPanel = new JPanel();
        // Create a label for each patient's text
        JLabel displayLabel1 = new JLabel(patient1.getAppointmentsDisplay());
        JLabel displayLabel2 = new JLabel(patient2.getAppointmentsDisplay());

        displayPanel.add(displayLabel1);
        displayPanel.add(displayLabel2);

        frame.setContentPane(displayPanel);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {// Ends program if close window is clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
