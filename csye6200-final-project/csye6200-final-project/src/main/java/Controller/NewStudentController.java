
package Controller;

import models.Daycare;
import models.Student;
import models.StudentEagerSingletonFactory;
import View.NewStudent;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.*;
import java.text.SimpleDateFormat;


public class NewStudentController {

    JPanel container;
    private Daycare daycare;
    private StudentMainController prevController;

    private NewStudent panel;
    
    public javax.swing.JTextField id;
    public javax.swing.JTextField lastName;
    public javax.swing.JTextField firstName;
    public javax.swing.JButton addNewStudent;
    public javax.swing.JTextField age;
    public javax.swing.JButton backButtons;
    public javax.swing.JTextField fatherName;
    public javax.swing.JTextField motherName;
    public javax.swing.JTextField enrollmentDate;
    public javax.swing.JTextField residentAddress;
    public javax.swing.JTextField contactinfo;
    public javax.swing.JComboBox ageGroupAssigned;
    


    public NewStudentController(JPanel container, Daycare daycare, StudentMainController prevController) {
        this.container = container;
        this.daycare = daycare;
        this.prevController = prevController;

        this.panel = new NewStudent(); //here the panel has access to all the text fields

        this.addNewStudent = panel.addStudentButton;
        this.contactinfo = panel.phoneNumberValue;
        this.age = panel.ageValue;
        this.backButtons = panel.backButton;
        this.residentAddress = panel.addressValue;
        this.firstName = panel.studentLastNameValue;
        this.lastName = panel.studentFirstNameValue;
        this.fatherName = panel.fatherNameValue;
        this.ageGroupAssigned = panel.ageGroupAssignedValue;
        this.motherName = panel.motherNameValue;
        this.id = panel.idValue;
        this.enrollmentDate = panel.enrolledOn;
        
        

        backButtons.addActionListener(l -> {
            goBackHandler();
        });

        addNewStudent.addActionListener(l -> {
            addStudentToSchool();
        });

    }
    
    private void goBackHandler() {
         container.remove(panel); 
        CardLayout layout = (CardLayout) container.getLayout();
       
        layout.previous(container);
        
        Component[] components = container.getComponents();
        Component component = components[components.length - 1];
        prevController.populateTable();
    }

    public NewStudent fetchStudentPanel() {
        panel.idValue.setText(String.valueOf(daycare.getListStudent().size()+1));
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String date = simpleDateFormat.format(new Date());
        panel.enrolledOn.setText(date);
        return panel;
    }

    

    private void addStudentToSchool() {
        String text = id.getText();
        String lastNameFields = lastName.getText();
        String enrollOnField = enrollmentDate.getText();
        String age = this.age.getText();
        String firstNameFielded = firstName.getText();
        String fatherNameFielded = fatherName.getText();
        String motherNameFielded = motherName.getText();
        String ageAssignField =  ageGroupAssigned.getSelectedItem().toString();
        String addressFieldset = residentAddress.getText();
        String phoneNumbersetField = contactinfo.getText();
        

//1,6,Mike,John,2022-11-20,John Snow,Rihanna,90 Parker Street,1234567890,false,6-12months
        if (firstNameFielded.equals("") || lastNameFields.equals("") || text.equals("") || age.equals("") || enrollOnField.equals("")
                || addressFieldset.equals("")|| phoneNumbersetField.equals("") || fatherNameFielded.equals("")|| motherNameFielded.equals("")) {
            JOptionPane.showMessageDialog(panel,
                    "Complete all the Necessary fields",
                    "Error Message",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        String stringObject = text + "," + age + "," + firstNameFielded + "," + lastNameFields + "," + enrollOnField + "," + fatherNameFielded + "," + motherNameFielded + "," + addressFieldset +  "," + phoneNumbersetField + ",false," + ageAssignField ;

        try {
            Student studentObject = StudentEagerSingletonFactory.getInstance().getObject(stringObject);
            daycare.addToDaycare(studentObject);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(panel,
                    "Error. Student can't be Created",
                    "Error Message",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(panel, "Student successfully created.");
    }

}
