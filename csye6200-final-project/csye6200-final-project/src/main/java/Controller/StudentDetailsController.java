
package Controller;

import Utils.Icon;
import models.AbstractIndividual;
import models.Daycare;
import View.UpdateStudentProfile;

import java.awt.CardLayout;
import java.awt.Component;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JPanel;


public class StudentDetailsController {

    private JPanel container;
    private Daycare daycare;
    private AbstractIndividual student;
    private StudentMainController prevController;
    
    private UpdateStudentProfile panel;
    
    public JButton backButton;

    public JButton pictureButton;
    
    private Map<JButton, String> buttonIconMap = new HashMap<>();

    public StudentDetailsController(JPanel container, AbstractIndividual student, Daycare daycare, StudentMainController prevController) {
        this.container = container;
        this.daycare = daycare;
        this.student = student;
        
        this.prevController = prevController;
        
        panel = new UpdateStudentProfile(container, student, daycare);
        
        this.backButton = panel.backButton;

//        this.pictureButton = panel.photoButton;
        
        backButton.addActionListener(l -> {
            goBackToPreviousScreen();
        });
        
        
        
        
    }
    
    public UpdateStudentProfile fetchStudentDetailsPanel() {
        setIcons();
        return panel;
    }
    
    private void setIcons() {
        Icon icon1 = new Icon();

//        buttonIconMap.put(pictureButton, "/icons/children.png");
        

        for (Map.Entry<JButton, String> button : buttonIconMap.entrySet()) {
            icon1.setIcon(button.getValue(), button.getKey());
        }
    }
    
    private void goBackToPreviousScreen() {
        container.remove(panel);
         CardLayout layouts1 = (CardLayout) container.getLayout();
        layouts1.previous(container);
        Component[] componentArrays2 = container.getComponents();
        Component component = componentArrays2[componentArrays2.length - 1];
        
        prevController.populateTable();
    }

    
}
