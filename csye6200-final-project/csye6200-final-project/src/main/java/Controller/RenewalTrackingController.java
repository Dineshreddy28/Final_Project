
package Controller;


import javax.swing.JPanel;
import models.Daycare;
import View.*;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.table.DefaultTableModel;
import models.Student;
import java.time.LocalDate;
import models.AbstractIndividual;
import javax.swing.*;


public class RenewalTrackingController {
    
    JPanel container;
    private Daycare daycare;
    private StudentMainController prevController;
    public javax.swing.JButton backButton;
    public javax.swing.JButton renewButton;
    private JTable RenewalTable;
    private JTable NoRenewalTable;
    

    private RenewalTracking panel;
    public RenewalTrackingController(JPanel container, Daycare daycare, StudentMainController prevController){
         this.container = container;
        this.daycare = daycare;
        this.prevController = prevController;
        
        this.panel = new RenewalTracking();
        this.backButton = panel.backButton;
        this.RenewalTable = panel.RenewalTable;
        this.NoRenewalTable = panel.NoRenewalTable;
        this.renewButton = panel.RenewButton;
        
        
        backButton.addActionListener(l -> {
            goBackHandler();
        });
        
        renewButton.addActionListener(l -> {
            changeEnrollmentDate();
        });
        
    }
    
    
    public RenewalTracking getRenewalTrackingPanel() {
        addToTable();
        return panel;
    }
    
    private void changeEnrollmentDate(){
        
       int selectedRow = RenewalTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }

        int studentIds = (int) RenewalTable.getValueAt(selectedRow, 0);
        AbstractIndividual selectedStudents1 = daycare.getStudentObjById(studentIds);
        
        if (selectedStudents1 != null) {
            Student stu = (Student) selectedStudents1;
            stu.setLastRegisteredData(LocalDate.now());
            stu.setIsRenewRequired(false);
            stu.setExpectedRenewDate(stu.getLastRegisteredData().plusYears(1L));
      
            JOptionPane.showMessageDialog(panel,
                    "Student enrollment renewed successfully ",
                    "Success",
                    JOptionPane.OK_OPTION);
            
           
          
            addToTable();
            
            
            
        }
    }
    
    private void addToTable(){
        RenewalTable.setAutoCreateRowSorter(true);
        DefaultTableModel modeled = (DefaultTableModel) RenewalTable.getModel();
        modeled.setRowCount(0);
        
        
        for (Student student : daycare.getStudentListwithIsNeedRenewTrue()) {
            System.out.println(student.getInstructorId());
            Object[] row = new Object[5];
            row[0] = student.getInstructorId();
            row[1] = student.getInstructorFirstName()+ " " + student.getInstructorLastName();
            row[2] = student.getInstructorAge();
            row[3] = student.getLastRegisteredData().toString();
            row[4] = student.getExpectedRenewDate().toString();
            modeled.addRow(row);
        }
        
       NoRenewalTable.setAutoCreateRowSorter(true);
        DefaultTableModel m = (DefaultTableModel) NoRenewalTable.getModel();
        m.setRowCount(0);
        

       for (Student studentID : daycare.getStudentListwithIsNeedRenewFalse()) {
            Object[] row = new Object[5];
            row[0] = studentID.getInstructorId();
            row[1] = studentID.getInstructorFirstName()+ " " + studentID.getInstructorLastName();
            row[2] = studentID.getInstructorAge();
            row[3] = studentID.getLastRegisteredData().toString();
            row[4] = studentID.getExpectedRenewDate().toString();
            m.addRow(row);
        }
    }
    
    private void goBackHandler() {
        container.remove(panel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
        Component[] componentArray1 = container.getComponents();
        Component component = componentArray1[componentArray1.length - 1];
        prevController.populateTable();
    }
     
}
