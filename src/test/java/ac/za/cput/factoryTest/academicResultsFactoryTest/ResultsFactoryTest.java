package ac.za.cput.factoryTest.academicResultsFactoryTest;

import ac.za.cput.domain.academicResults.Results;
import ac.za.cput.factory.academicsResultsFactory.ResultsFactory;
import org.junit.Assert;
import org.junit.Test;

public class ResultsFactoryTest {

    @Test
    public void getResults() {

        String studentNum = "215062264";
        double finalMark = 100;

        Results c = ResultsFactory.getResults(studentNum,finalMark);
        System.out.println(c);
        Assert.assertNotNull(c.getStudentNum()+"\n"+c.getFinalMark());
    }

}
