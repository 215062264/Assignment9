package ac.za.cput.factoryTest;

import ac.za.cput.Domain.Exam;
import ac.za.cput.Factory.ExamFactory;
import org.junit.Assert;
import org.junit.Test;

public class ExamFactoryTest {

    @Test
    public void getTutorial() {

        String exNum = "SCI212";
        String stdNum = "215062264";
        double exMark = 100;

        Exam c = ExamFactory.getExam(exNum,stdNum,exMark);
        System.out.println(c);
        Assert.assertNotNull(c.getExamNum()+"\n"+c.getStudentNum()+"\n"+c.getExamMark());
    }

}
