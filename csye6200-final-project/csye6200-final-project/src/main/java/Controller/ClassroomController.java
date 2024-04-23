
package Controller;

import models.Classroom;
import models.Daycare;
import View.DaycareClassrooms;

import java.awt.CardLayout;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import models.Instructor;

public class ClassroomController {

    private JPanel container;
    private Daycare daycare;

    private DaycareClassrooms panel;

    private JButton backButton;
    private JTable classTable;

    
    private PanelInfo panelInfo;
    private PanelInfo panel2;
    private PanelInfo panels3;
    private PanelInfo panels4;
    private PanelInfo panels5;
    private PanelInfo panels6;
    
    public static class PanelInfo{
        private JTable infoTable;
        
        
        public PanelInfo(JTable t){
            infoTable = t;
        }
        
        public void fillClassroomIntoPanel(Classroom classRoomObj){
            DefaultTableModel model1 = (DefaultTableModel) infoTable.getModel();
            model1.setRowCount(0);
            Object[] rows = new Object[2];
            Object[] row1 = new Object[2];
            Object[] row2 = new Object[2];
            Object[] row3 = new Object[2];
            rows[0] = "Max Possible Groups";
            rows[1] = classRoomObj.getClassroomNumber();
            int[] rangeArr = classRoomObj.getRangeOfAge();
            row1[0] = "Range";
            row1[1] = rangeArr[0] + " - " + rangeArr[1];
            row2[0] = "Group Size";
            row2[1] = classRoomObj.getClassroomNumber();
            row3[0] = "Total Students";
            int count = 0;
            for(Instructor teacher
                    : classRoomObj.getListTeacher()){
                count += teacher.getCount();
            }
            row3[1] = count;
            model1.addRow(rows);
            model1.addRow(row1);
            model1.addRow(row2);
            model1.addRow(row3);
        }
        
    }
    

    public ClassroomController(JPanel container, Daycare daycare) {
        this.container = container;
        this.daycare = daycare;

        this.panel = new DaycareClassrooms();

        this.backButton = panel.buttons;


        backButton.addActionListener(l -> {
            goBack();
        });



    }

    public DaycareClassrooms getClassroomsPanel() {

        displayClassrooms();
        return panel;
    }
    
    
    
    public void displayClassrooms(){
        List<Classroom> classRoomList = daycare.getListClassroom();
        panelInfo = new PanelInfo(panel.jTables1);
        panelInfo.fillClassroomIntoPanel(classRoomList.get(0));
        
        panel2 = new PanelInfo(panel.jTabled2);
        panel2.fillClassroomIntoPanel(classRoomList.get(1));
        
        panels3 = new PanelInfo(panel.jTables3);
        panels3.fillClassroomIntoPanel(classRoomList.get(2));
        
        panels4 = new PanelInfo(panel.jTable4);
        panels4.fillClassroomIntoPanel(classRoomList.get(3));
        
        panels5 = new PanelInfo(panel.jTable5);
        panels5.fillClassroomIntoPanel(classRoomList.get(4));
//        
        panels6 = new PanelInfo(panel.jtabled6);
        panels6.fillClassroomIntoPanel(classRoomList.get(5));

    }

    private void goBack() {
        container.remove(panel);
        CardLayout layouts1 = (CardLayout) container.getLayout();
        layouts1.previous(container);
    }

}
