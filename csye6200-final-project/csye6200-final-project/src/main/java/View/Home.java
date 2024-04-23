
package View;

import Controller.ClassroomController;
import Controller.VaccinationController;
import Utils.Icon;
import Controller.StudentMainController;

import models.Daycare;
import java.awt.CardLayout;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JPanel;


public class Home extends javax.swing.JPanel {

    private JPanel mainContainer;
    private Daycare daycare;

    private Map<JButton, String> buttonIconMap = new HashMap<>();

    public Home(JPanel mainContainer, Daycare daycare) {
        initComponents();

        Icon images1 = new Icon();

        
        for (Map.Entry<JButton, String> button : buttonIconMap.entrySet()) {
            images1.setIcon(button.getValue(), button.getKey());
        }
        this.mainContainer = mainContainer;
        this.daycare = daycare;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dashboardContainer = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        studentsTile = new javax.swing.JPanel();
        studentsButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        immunizationButton = new javax.swing.JButton();
        teachersButton = new javax.swing.JButton();
        classroomsButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        headingBanner = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1100, 800));
        setPreferredSize(new java.awt.Dimension(1100, 800));

        dashboardContainer.setBackground(new java.awt.Color(255, 255, 255));
        dashboardContainer.setForeground(new java.awt.Color(255, 255, 255));
        dashboardContainer.setDoubleBuffered(false);
        dashboardContainer.setEnabled(false);
        dashboardContainer.setFocusable(false);
        dashboardContainer.setOpaque(false);
        dashboardContainer.setRequestFocusEnabled(false);
        dashboardContainer.setVerifyInputWhenFocusTarget(false);
        dashboardContainer.setLayout(new java.awt.CardLayout(10, 10));

        homePanel.setBackground(new java.awt.Color(255, 255, 255));

        studentsTile.setBackground(new java.awt.Color(255, 255, 255));
        studentsTile.setForeground(new java.awt.Color(255, 255, 255));
        studentsTile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studentsButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        studentsButton.setForeground(new java.awt.Color(255, 255, 255));
        studentsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-student-100.png"))); // NOI18N
        studentsButton.setBorderPainted(false);
        studentsButton.setContentAreaFilled(false);
        studentsButton.setDefaultCapable(false);
        studentsButton.setFocusPainted(false);
        studentsButton.setFocusable(false);
        studentsButton.setRequestFocusEnabled(false);
        studentsButton.setVerifyInputWhenFocusTarget(false);
        studentsButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                studentsButtonFocusGained(evt);
            }
        });
        studentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentsButtonActionPerformed(evt);
            }
        });
        studentsTile.add(studentsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 150, 100));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel2.setText("IMMUNIZATION");
        studentsTile.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 150, -1));

        immunizationButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        immunizationButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-health-100.png"))); // NOI18N
        immunizationButton.setBorderPainted(false);
        immunizationButton.setContentAreaFilled(false);
        immunizationButton.setDefaultCapable(false);
        immunizationButton.setFocusPainted(false);
        immunizationButton.setFocusable(false);
        immunizationButton.setVerifyInputWhenFocusTarget(false);
        immunizationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                immunizationButtonActionPerformed(evt);
            }
        });
        studentsTile.add(immunizationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 150, 100));

        teachersButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        teachersButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-classroom-100.png"))); // NOI18N
        teachersButton.setBorderPainted(false);
        teachersButton.setContentAreaFilled(false);
        teachersButton.setDefaultCapable(false);
        teachersButton.setFocusPainted(false);
        teachersButton.setFocusable(false);
        teachersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teachersButtonActionPerformed(evt);
            }
        });
        studentsTile.add(teachersButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 140, 100));

        classroomsButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        classroomsButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-teacher-100.png"))); // NOI18N
        classroomsButton1.setBorderPainted(false);
        classroomsButton1.setContentAreaFilled(false);
        classroomsButton1.setDefaultCapable(false);
        classroomsButton1.setFocusPainted(false);
        classroomsButton1.setFocusable(false);
        classroomsButton1.setRequestFocusEnabled(false);
        classroomsButton1.setVerifyInputWhenFocusTarget(false);
        classroomsButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classroomsButton1ActionPerformed(evt);
            }
        });
        studentsTile.add(classroomsButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 140, 110));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel1.setText("TEACHERS");
        studentsTile.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 120, -1));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel3.setText("CLASSROOM");
        studentsTile.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, 130, 20));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel4.setText("STUDENTS");
        studentsTile.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 110, -1));

        headingBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/heading5.png"))); // NOI18N
        studentsTile.add(headingBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 610, 150));

        homePanel.add(studentsTile);

        dashboardContainer.add(homePanel, "card2");

        add(dashboardContainer);
    }// </editor-fold>//GEN-END:initComponents

    private void immunizationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_immunizationButtonActionPerformed
        // TODO add your handling code here:
        VaccinationController imf = new VaccinationController(dashboardContainer, daycare);
        CardLayout layouted1 = (CardLayout) dashboardContainer.getLayout();
        dashboardContainer.add(imf.getImmunizationPanel());
        layouted1.next(dashboardContainer);
    }//GEN-LAST:event_immunizationButtonActionPerformed

    private void teachersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teachersButtonActionPerformed
        // TODO add your handling code here:

        
        ClassroomController classroomControlled = new ClassroomController(dashboardContainer, daycare);
        CardLayout dashboardContainerLayout = (CardLayout) dashboardContainer.getLayout();
        dashboardContainer.add(classroomControlled.getClassroomsPanel());
        dashboardContainerLayout.next(dashboardContainer);
    }//GEN-LAST:event_teachersButtonActionPerformed

    private void studentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsButtonActionPerformed
        // TODO add your handling code here:

        StudentMainController student33 = new StudentMainController(dashboardContainer, daycare);
        CardLayout layouted6 = (CardLayout) dashboardContainer.getLayout();
        dashboardContainer.add(student33.getStudentPanel());
        layouted6.next(dashboardContainer);
    }//GEN-LAST:event_studentsButtonActionPerformed

    private void studentsButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_studentsButtonFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_studentsButtonFocusGained

    private void classroomsButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classroomsButton1ActionPerformed
        // TODO add your handling code here:
        TeacherRecords tp = new TeacherRecords(dashboardContainer, daycare);
        CardLayout layouted4 = (CardLayout) dashboardContainer.getLayout();
        dashboardContainer.add(tp);
        layouted4.next(dashboardContainer);

    }//GEN-LAST:event_classroomsButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton classroomsButton1;
    private javax.swing.JPanel dashboardContainer;
    private javax.swing.JLabel headingBanner;
    private javax.swing.JPanel homePanel;
    private javax.swing.JButton immunizationButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton studentsButton;
    private javax.swing.JPanel studentsTile;
    private javax.swing.JButton teachersButton;
    // End of variables declaration//GEN-END:variables
}
