package ac.za.cput.factoryTest.academicResultsFactoryTest;

import ac.za.cput.domain.academicResults.Quiz;
import ac.za.cput.factory.academicsResultsFactory.QuizFactory;
import org.junit.Assert;
import org.junit.Test;

public class QuizFactoryTest {

    @Test
    public void getQuiz() {

        String ddate = "17/07/2019";
        String studNum = "215062264";
        double asMark = 100;

        Quiz c = QuizFactory.getQuiz(ddate,studNum,asMark);
        System.out.println(c);
        Assert.assertNotNull(c.getDueDate()+"\n"+c.getStudentNum()+"\n"+c.getQuizMark());
    }

}
