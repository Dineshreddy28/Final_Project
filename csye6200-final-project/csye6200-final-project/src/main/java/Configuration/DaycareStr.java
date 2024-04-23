
package Configuration;

import Utils.ConversionUtil;
import models.RatioRule;
import models.Daycare;
import models.Student;
import models.StudentEagerSingletonFactory;
import models.Vaccination;
import java.util.ArrayList;
import java.util.List;


public class DaycareStr {

    public static Daycare captureData() {
        List<String> vaccinationDetails = ConversionUtil.readingCSVFile("Vaccination.txt");
        
        List<Vaccination> vaccinationDaycare = new ArrayList<>();
        for (String vaccineRecord : vaccinationDetails) {
            vaccinationDaycare.add(new Vaccination(vaccineRecord));
        }
        List<String> RatioDetails = ConversionUtil.readingCSVFile("Ratio.txt");
        List<RatioRule> ratioRules = new ArrayList<>();
        for (String s : RatioDetails) {
            ratioRules.add(new RatioRule((s)));
        }
        Daycare dayCare1 = new Daycare();
        List<String> TeacherCSVList = ConversionUtil.readingCSVFile("Teachers.txt");
        dayCare1.setTeacherCSVList(TeacherCSVList);
        for (RatioRule r : ratioRules) {
            dayCare1.addRatioRule(r);
        }
        List<String> StudentDetails = ConversionUtil.readingCSVFile("StudentList.txt");
        for (String studentString : StudentDetails) {
            Student student1 = StudentEagerSingletonFactory.getInstance().getObject(studentString);
            for (Vaccination vObj : vaccinationDaycare) {
                if (vObj.getStudentId() == student1.getInstructorId()) {
                    student1.addVax(vObj);
                }
            }
            dayCare1.addToDaycare(student1);
            dayCare1.addAllStudentObjectsToCSV();
        }
        return dayCare1;
    }
}
