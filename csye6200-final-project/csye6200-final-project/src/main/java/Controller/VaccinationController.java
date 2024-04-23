
package Controller;

import models.AbstractIndividual;
import models.Daycare;
import models.Student;
import View.VaccinationDetails;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class VaccinationController {

    private JPanel container;
    private Daycare daycare;

    private VaccinationDetails panel3;

    private javax.swing.JButton viewAnnButton;
    private javax.swing.JButton backButton;
    public javax.swing.JTable vaxDetailTable;

    

    public VaccinationController(JPanel container, Daycare daycare) {
        this.container = container;
        this.daycare = daycare;

        this.panel3 = new VaccinationDetails();
        this.backButton = panel3.backButton;
//        this.immuTable = panel.immuTable;
        this.vaxDetailTable = panel3.StudentVaxTable;
        this.viewAnnButton = panel3.viewVaccination;

        
        backButton.addActionListener(l -> {
            goBack();
        });
        
        viewAnnButton.addActionListener(c ->{
            viewAnn();
        });
        
       
    }
    
    public void viewVaccinationAnniversary(){
        int selectedRow = vaxDetailTable.getSelectedRow();
     
     if(selectedRow< 0){
         JOptionPane.showMessageDialog(null, "Please Select a Student");
     }
     int detailtable = (int) vaxDetailTable.getValueAt(selectedRow, 0);
     AbstractIndividual selectedStudent= daycare.getStudentObjById(detailtable);
     if(((Student)selectedStudent).getVaxList().isEmpty()){
         System.out.println("No Entry");
         JOptionPane.showMessageDialog(null, "No Vaccination Records Found");
     }
     List<String> lastDose = ((Student) selectedStudent).getVaxLastDose();
     List<String> nextDose = ((Student) selectedStudent).getVaxNextDose();
     System.out.println((Student)selectedStudent);
     
     panel3.hibLast.setText(lastDose.get(0));
     panel3.hibNext.setText(nextDose.get(0));
     
     panel3.dtapLast.setText(lastDose.get(1));
     panel3.dtapNext.setText(nextDose.get(1));
     
     panel3.polioLast.setText(lastDose.get(2));
     panel3.polioNext.setText(nextDose.get(2));
     
     panel3.hepatitisbLast.setText(lastDose.get(3));
     panel3.hepatitisbNext.setText(nextDose.get(3));
     
     panel3.mmrLast.setText(lastDose.get(4));
     panel3.mmrNext.setText(nextDose.get(4));
     
     panel3.getVaricellaLast().setText(lastDose.get(5));
     panel3.getVaricellaNext().setText(nextDose.get(5));
  
    }

    public VaccinationDetails getImmunizationPanel() {
        setTable();
        return panel3;
    }

    public void setTable() {


//        vaxDetailTable.setAutoCreateRowSorter(true);
        DefaultTableModel vaxTableModel = (DefaultTableModel) vaxDetailTable.getModel();
        vaxTableModel.setRowCount(0);
        for (AbstractIndividual student : daycare.getListStudent()) {
            Object[] row = new Object[9];
            Student student3 = (Student) student;
            row[0] = student3.getInstructorId();
            row[1] = student.getInstructorFirstName() + " " + student3.getInstructorLastName();
            row[2] = student.getInstructorAge();
            List<String> VaxCount = ((Student) student).getVaxCount();
            // ["Hib", "DTaP", "Polio", "Hepatitis B", "MMR", "Varicella"]
            row[3] = VaxCount.get(0); // "Hib"
            row[4] = VaxCount.get(1); // "DTaP"
            row[5] = VaxCount.get(2); // "Polio"
            row[6] = VaxCount.get(3); // "Hepatitis B"
            row[7] = VaxCount.get(4); // "MMR"
            row[8] = VaxCount.get(5); // "Varicella"
            vaxTableModel.addRow(row);
        }
        
    
    }
    
    
    private void viewAnn(){
        viewVaccinationAnniversary();
    }
    private void goBack() {
        container.remove(panel3);
        CardLayout layouted = (CardLayout) container.getLayout();
        layouted.previous(container);
    }

}
