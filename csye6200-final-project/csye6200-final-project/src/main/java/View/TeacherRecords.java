
package View;

import models.Classroom;
import models.Daycare;
import models.Instructor;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class TeacherRecords extends javax.swing.JPanel {

    private JPanel container;
    private Daycare daycare;
    private List<Instructor> teachersList;

    /**
     * Creates new form StudentsPanel
     */
    public TeacherRecords(JPanel container, Daycare daycare) {
        initComponents();
        this.container = container;
        this.daycare = daycare;

        populateTable();
    }

    public void populateTable() {
        teachersTable.setAutoCreateRowSorter(true);
        DefaultTableModel model = (DefaultTableModel) teachersTable.getModel();
        model.setRowCount(0);
        daycare.showAll();
        // TODO: Add wage column to the table
        for (Classroom classroom
                : daycare.getListClassroom()) {
            List<Instructor> teachers = classroom.getListTeacher();
//            Table Fields
//"ID", "Firstname", "Lastname", "Age", "ClassroomId", "Size", "Count", "Wage", "NextReviewIn", "NextReviewDate", "LastReviewDate"
   
            for (Instructor teacher : teachers) {
                Object[] row = new Object[9];
                row[0] = teacher.getInstructorId();
                row[1] = teacher.getInstructorFirstName();
                row[2] = teacher.getInstructorLastName();
                row[3] = String.valueOf(teacher.getDaysForReview()) + " days";
                row[4] = teacher.getNextReviewDate();
                row[5] = teacher.getDateOfReview();
                
                model.addRow(row);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        teachersTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        viewTeacherButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1100, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Teachers List");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 22, 380, 46));

        teachersTable.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 13)); // NOI18N
        teachersTable.setForeground(new java.awt.Color(255, 255, 255));
        teachersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Firstname", "Lastname", "NextReviewIn", "NextReviewDate", "LastReviewDate"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        teachersTable.setOpaque(false);
        jScrollPane1.setViewportView(teachersTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 86, 831, 330));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, -1, 30));

        backButton.setBackground(new java.awt.Color(102, 102, 255));
        backButton.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        backButton.setText(" Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel2.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, -1));

        viewTeacherButton.setBackground(new java.awt.Color(102, 102, 255));
        viewTeacherButton.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        viewTeacherButton.setText("View details");
        viewTeacherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTeacherButtonActionPerformed(evt);
            }
        });
        jPanel2.add(viewTeacherButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 460, 190, 30));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 28, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backButtonActionPerformed

    private void viewTeacherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTeacherButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = teachersTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }

        int teacherId = (int) teachersTable.getValueAt(selectedRow, 0);

        for (Classroom classroom : daycare.getListClassroom()) {
            List<Instructor> teachers = classroom.getListTeacher();
            for (Instructor teacherObj : teachers) {
                if (teacherObj.getInstructorId() == teacherId) {
                    TeacherProfile teacherInfoPanel = new TeacherProfile(container, teacherObj);
                    container.add(teacherInfoPanel);
                    CardLayout layout = (CardLayout) container.getLayout();
                    layout.next(container);
                    return;
                }
            }
        }
        System.out.println("Teacher not found");
    }//GEN-LAST:event_viewTeacherButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable teachersTable;
    private javax.swing.JButton viewTeacherButton;
    // End of variables declaration//GEN-END:variables
}