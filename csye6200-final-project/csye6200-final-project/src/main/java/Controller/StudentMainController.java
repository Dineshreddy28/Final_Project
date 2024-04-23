
package Controller;

import Utils.Icon;
import models.AbstractIndividual;
import models.Classroom;
import models.Daycare;
import models.Student;
import models.Instructor;
import View.StudentRecords;
import java.awt.CardLayout;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class StudentMainController {

    private JPanel container;
    private Daycare daycare;
    public JButton backButton;   
    private StudentRecords panel;

    public JButton addStudentButton;
    
    public JButton deleteButton1;
    public JButton studentRegistrationButton;
    public JButton viewStudentButton;
    private JTable allStudentsTable;
    public JButton sortAge;
    public JButton sortName;

    
    

    private Map<JButton, String> iconButtonMapping = new HashMap<>();

    public StudentMainController(JPanel container, Daycare daycare) {
        this.container = container;
        this.daycare = daycare;

        this.panel = new StudentRecords();
        
        this.addStudentButton = panel.addStudentButton1;
        this.backButton = panel.backButton;
        this.deleteButton1 = panel.deleteButton1;

        this.studentRegistrationButton = panel.registrationButton;
        this.viewStudentButton = panel.viewStudentButton;
        this.sortName = panel.sortByName;
        this.sortAge = panel.sortByAge;

        this.allStudentsTable = panel.studentsTable;

        backButton.addActionListener(l -> {
            goBackToPreviousScreen();
        });
        
        sortName.addActionListener(l -> {
            sortByName();
        });
        
        sortAge.addActionListener(l -> {
            sortByAge();
        });

        viewStudentButton.addActionListener(l -> {
            fetchStudentInformation();
        });

        studentRegistrationButton.addActionListener(l -> {
            fetchStudentEnrollmentInformation();
        });

        deleteButton1.addActionListener(l -> {
            removeStudents();
        });

        addStudentButton.addActionListener(l -> {
            addNewStudent();
        });

    }

    public JPanel getStudentPanel() {
        setIcons();
        populateTable();
        return panel;
    }

    private void setIcons() {
        Icon imageHelp = new Icon();

//        iconButtonMapping.put(studentRegistrationButton, "/icons/renewal.png");
//        iconButtonMapping.put(addStudentButton, "/icons/add-user.png");
//        iconButtonMapping.put(backButton, "/icons/previous.png");
//        iconButtonMapping.put(deleteButton1, "/icons/delete.png");
//        iconButtonMapping.put(viewStudentButton, "/icons/update.png");

        for (Map.Entry<JButton, String> button : iconButtonMapping.entrySet()) {
            imageHelp.setIcon(button.getValue(), button.getKey());
        }
    }

    public void populateTable() {
        allStudentsTable.setAutoCreateRowSorter(true);
        DefaultTableModel models3 = (DefaultTableModel) allStudentsTable.getModel();
        models3.setRowCount(0);

        for (AbstractIndividual student : daycare.getListStudent()) {
            Object[] row = new Object[12];
            Student students = (Student) student;
            row[0] = students.getInstructorId();
            row[1] = students.getInstructorAge();
            row[2] = students.getInstructorFirstName();
            row[3] = students.getInstructorLastName();
            row[4] = students.getStudentFatherName();
            row[5] = students.getStudentMotherName();
            row[6] = students.getStudentAddress();
            row[7] = students.getParentContactNumber();
            row[8] = String.valueOf(students.isIsRenewRequired());
            row[9] = students.getLastRegisteredData();
            row[10] = students.getExpectedRenewDate();
            row[11] = students.getTeacherId();
            models3.addRow(row);
        }
    }

    private void goBackToPreviousScreen() {
        container.remove(panel);
        CardLayout layouts0 = (CardLayout) container.getLayout();
        
        layouts0.previous(container);
        
    }

    private void fetchStudentInformation() {
        int selectedRows = allStudentsTable.getSelectedRow();

        if (selectedRows < 0) {
            
            JOptionPane.showMessageDialog(null, "Please Select a Student");
            return;
        }

        int studentId = (int) allStudentsTable.getValueAt(selectedRows, 0);
        AbstractIndividual selectedStudents3 = daycare.getStudentObjById(studentId);
        if (selectedStudents3 != null) {
            StudentDetailsController detailsController2 = new StudentDetailsController(container, selectedStudents3, daycare, this);
            CardLayout layout = (CardLayout) container.getLayout();
            container.add(detailsController2.fetchStudentDetailsPanel());
            layout.next(container);
        }
    }

    private void fetchStudentEnrollmentInformation() {
        RenewalTrackingController rsc = new RenewalTrackingController(container, daycare, this);
       
        CardLayout layouts5 = (CardLayout) container.getLayout();
         container.add(rsc.getRenewalTrackingPanel());
        layouts5.next(container);
    }


    private void removeStudents() {
        int selectedRows1 = allStudentsTable.getSelectedRow();

        if (selectedRows1 < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a Student to Remove");
            return;
        }

        int studentId = (int) allStudentsTable.getValueAt(selectedRows1, 0);
        int teacherId = (int) allStudentsTable.getValueAt(selectedRows1, 11);

        try {
            daycare.deleteStudentObjById(studentId);


            for (Classroom rooms1 : daycare.getListClassroom()) {
                for (Instructor instructors : rooms1.getListTeacher()) {
                    if (instructors.getInstructorId() == teacherId) {
                        instructors.deleteStudentById(studentId);
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        populateTable();
        JOptionPane.showMessageDialog(panel,
                "Student deleted successfully.");
    }

    private void addNewStudent() {
        NewStudentController controllers1 = new NewStudentController(container, daycare, this);
       
        CardLayout layout3 = (CardLayout) container.getLayout();
         container.add(controllers1.fetchStudentPanel());
        layout3.next(container);
    }
    
    private void sortByName() {
    daycare.sortStudentsByName();
    populateTable(); 
    }
    
    private void sortByAge() {
    daycare.sortStudentsByAge();
    populateTable(); 
    }
}
