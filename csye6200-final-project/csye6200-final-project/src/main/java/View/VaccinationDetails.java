
package View;

import javax.swing.JPanel;

import models.Daycare;


public class VaccinationDetails extends javax.swing.JPanel {

    private Daycare daycare;
    private JPanel container;
 

    public VaccinationDetails() {
        initComponents();
    }
    
    public VaccinationDetails(JPanel container, Daycare daycare){
        this.container = container;
        this.daycare = daycare;
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        StudentVaxTable = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        immunizationLabel = new javax.swing.JLabel();
        viewVaccination = new javax.swing.JButton();
        vaccineAnnPanel = new javax.swing.JPanel();
        vaccineLabel = new javax.swing.JLabel();
        DTapLabel = new javax.swing.JLabel();
        polioLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        hibLast = new javax.swing.JTextField();
        HibLabel = new javax.swing.JLabel();
        lastDoseLabel = new javax.swing.JLabel();
        nextDoseName = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dtapLast = new javax.swing.JTextField();
        hepatitisbLast = new javax.swing.JTextField();
        mmrLast = new javax.swing.JTextField();
        varicellaLast = new javax.swing.JTextField();
        polioLast = new javax.swing.JTextField();
        hibNext = new javax.swing.JTextField();
        dtapNext = new javax.swing.JTextField();
        polioNext = new javax.swing.JTextField();
        varicellaNext = new javax.swing.JTextField();
        hepatitisbNext = new javax.swing.JTextField();
        mmrNext = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1100, 650));
        setPreferredSize(new java.awt.Dimension(1100, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(0, 102, 255));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        StudentVaxTable.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        StudentVaxTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "StudentId", "StudentName", "Age", "Hib", "DTaP", "Polio", "Hepatitis B", "MMR", "Varicella"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        StudentVaxTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        StudentVaxTable.setSelectionForeground(new java.awt.Color(255, 153, 51));
        jScrollPane2.setViewportView(StudentVaxTable);
        if (StudentVaxTable.getColumnModel().getColumnCount() > 0) {
            StudentVaxTable.getColumnModel().getColumn(0).setHeaderValue("StudentId");
            StudentVaxTable.getColumnModel().getColumn(1).setHeaderValue("StudentName");
            StudentVaxTable.getColumnModel().getColumn(2).setHeaderValue("Age");
            StudentVaxTable.getColumnModel().getColumn(3).setHeaderValue("Hib");
            StudentVaxTable.getColumnModel().getColumn(4).setHeaderValue("DTaP");
            StudentVaxTable.getColumnModel().getColumn(5).setHeaderValue("Polio");
            StudentVaxTable.getColumnModel().getColumn(6).setHeaderValue("Hepatitis B");
            StudentVaxTable.getColumnModel().getColumn(7).setHeaderValue("MMR");
            StudentVaxTable.getColumnModel().getColumn(8).setHeaderValue("Varicella");
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 896, 270));

        backButton.setBackground(new java.awt.Color(102, 102, 255));
        backButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        backButton.setText("Back");
        backButton.setBorder(null);
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 67, 35));

        immunizationLabel.setBackground(new java.awt.Color(255, 255, 255));
        immunizationLabel.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        immunizationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        immunizationLabel.setText("Vaccinations Details");
        add(immunizationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 340, 48));

        viewVaccination.setBackground(new java.awt.Color(102, 102, 255));
        viewVaccination.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viewVaccination.setText("View");
        viewVaccination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVaccinationActionPerformed(evt);
            }
        });
        add(viewVaccination, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 40, 122, 32));

        vaccineAnnPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        vaccineAnnPanel.setForeground(new java.awt.Color(0, 153, 255));

        vaccineLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        vaccineLabel.setText("Vaccine");

        DTapLabel.setText("DTap");

        polioLabel.setText("Polio");

        jLabel5.setText("Hepatitis B");

        jLabel6.setText("MMR");

        hibLast.setEditable(false);

        HibLabel.setText("Hib");

        lastDoseLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lastDoseLabel.setText("Last Dose");

        nextDoseName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nextDoseName.setText("NextDose");

        jLabel7.setText("Varicella");

        dtapLast.setEditable(false);

        hepatitisbLast.setEditable(false);

        mmrLast.setEditable(false);

        varicellaLast.setEditable(false);

        polioLast.setEditable(false);

        hibNext.setEditable(false);

        dtapNext.setEditable(false);

        polioNext.setEditable(false);

        varicellaNext.setEditable(false);

        hepatitisbNext.setEditable(false);
        hepatitisbNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hepatitisbNextActionPerformed(evt);
            }
        });

        mmrNext.setEditable(false);

        javax.swing.GroupLayout vaccineAnnPanelLayout = new javax.swing.GroupLayout(vaccineAnnPanel);
        vaccineAnnPanel.setLayout(vaccineAnnPanelLayout);
        vaccineAnnPanelLayout.setHorizontalGroup(
            vaccineAnnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vaccineAnnPanelLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addGroup(vaccineAnnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(vaccineLabel)
                    .addComponent(HibLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(vaccineAnnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(polioLabel)
                        .addComponent(DTapLabel))
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(60, 60, 60)
                .addGroup(vaccineAnnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vaccineAnnPanelLayout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(lastDoseLabel))
                    .addGroup(vaccineAnnPanelLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addGroup(vaccineAnnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(hibLast, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addComponent(dtapLast, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(varicellaLast, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mmrLast, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hepatitisbLast, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(polioLast, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(165, 165, 165)
                .addGroup(vaccineAnnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hibNext)
                    .addComponent(nextDoseName)
                    .addComponent(dtapNext)
                    .addComponent(polioNext)
                    .addComponent(varicellaNext, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hepatitisbNext)
                    .addComponent(mmrNext, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(169, 169, 169))
        );
        vaccineAnnPanelLayout.setVerticalGroup(
            vaccineAnnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vaccineAnnPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(vaccineAnnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vaccineLabel)
                    .addComponent(lastDoseLabel)
                    .addComponent(nextDoseName))
                .addGap(18, 18, 18)
                .addGroup(vaccineAnnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hibLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hibNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vaccineAnnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dtapLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtapNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(polioLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vaccineAnnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(polioLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(polioNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DTapLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vaccineAnnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vaccineAnnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(hepatitisbLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(hepatitisbNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(HibLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(vaccineAnnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(mmrLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mmrNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vaccineAnnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vaccineAnnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(varicellaLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(varicellaNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        add(vaccineAnnPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 900, 280));
    }// </editor-fold>//GEN-END:initComponents

    private void viewVaccinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVaccinationActionPerformed

//     int selectedRow = StudentVaxTable.getSelectedRow();
//     
//     if(selectedRow< 0){
//         JOptionPane.showMessageDialog(null, "Please Select a Student");
//     }
//     int studentId = (int) StudentVaxTable.getValueAt(selectedRow, 0);
//     System.out.println(studentId);
//     AbstractIndividual selectedStudent= new Student();
//     for(AbstractIndividual stud : daycare.getListStudent()){
//         if(stud.getInstructorId() == studentId)
//             selectedStudent = stud;
//     }
//     List<String> lastDose = ((Student) selectedStudent).getVaxLastDose();
//     List<String> nextDose = ((Student) selectedStudent).getVaxNextDose();
//
//     hibLast.setText(lastDose.get(0));
//     hibNext.setText(nextDose.get(0));
//
//     dtapLast.setText(lastDose.get(1));
//

    }//GEN-LAST:event_viewVaccinationActionPerformed

    private void hepatitisbNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hepatitisbNextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hepatitisbNextActionPerformed

    public void setTable(){
        
    }
    
//    DefaultTableModel vaxTableModel = (DefaultTableModel) vaxDetailTable.getModel();
//        vaxTableModel.setRowCount(0);
//        for (AbstractIndividual student : daycare.getListStudent()) {
//            Object[] row = new Object[9];
//            Student s = (Student) student;
//            row[0] = s.getInstructorId();
//            row[1] = student.getInstructorFirstName() + " " + s.getInstructorLastName();
//            row[2] = student.getInstructorAge();
//            List<String> VaxCount = ((Student) student).getVaxCount();
//            // ["Hib", "DTaP", "Polio", "Hepatitis B", "MMR", "Varicella"]
//            row[3] = VaxCount.get(0); // "Hib"
//            row[4] = VaxCount.get(1); // "DTaP"
//            row[5] = VaxCount.get(2); // "Polio"
//            row[6] = VaxCount.get(3); // "Hepatitis B"
//            row[7] = VaxCount.get(4); // "MMR"
//            row[8] = VaxCount.get(5); // "Varicella"
//            vaxTableModel.addRow(row);
//        }
//    
    
//    private void fetchStudentInformation() {
//        int selectedRow = allStudentsTable.getSelectedRow();
//
//        if (selectedRow < 0) {
//            return;
//        }
//
//        int studentId = (int) allStudentsTable.getValueAt(selectedRow, 0);
//        AbstractIndividual selectedStudent = daycare.getStudentObjById(studentId);
//        if (selectedStudent != null) {
//            StudentDetailsController sdc = new StudentDetailsController(container, selectedStudent, daycare, this);
//            CardLayout layout = (CardLayout) container.getLayout();
//            container.add(sdc.fetchStudentDetailsPanel());
//            layout.next(container);
//        }
//    }
    
    public javax.swing.JTextField getVaricellaLast(){
        return this.varicellaLast;
    }
    
    public javax.swing.JTextField getVaricellaNext(){
        return this.varicellaNext;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DTapLabel;
    private javax.swing.JLabel HibLabel;
    public javax.swing.JTable StudentVaxTable;
    public javax.swing.JButton backButton;
    public javax.swing.JTextField dtapLast;
    public javax.swing.JTextField dtapNext;
    public javax.swing.JTextField hepatitisbLast;
    public javax.swing.JTextField hepatitisbNext;
    public javax.swing.JTextField hibLast;
    public javax.swing.JTextField hibNext;
    private javax.swing.JLabel immunizationLabel;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lastDoseLabel;
    public javax.swing.JTextField mmrLast;
    public javax.swing.JTextField mmrNext;
    private javax.swing.JLabel nextDoseName;
    private javax.swing.JLabel polioLabel;
    public javax.swing.JTextField polioLast;
    public javax.swing.JTextField polioNext;
    private javax.swing.JPanel vaccineAnnPanel;
    private javax.swing.JLabel vaccineLabel;
    public javax.swing.JTextField varicellaLast;
    public javax.swing.JTextField varicellaNext;
    public javax.swing.JButton viewVaccination;
    // End of variables declaration//GEN-END:variables
}
