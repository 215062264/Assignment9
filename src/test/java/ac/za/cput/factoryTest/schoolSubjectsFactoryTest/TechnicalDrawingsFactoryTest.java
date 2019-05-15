package ac.za.cput.factoryTest.schoolSubjectsFactoryTest;

import ac.za.cput.domain.schoolSubjects.TechnicalDrawings;
import ac.za.cput.factory.schoolSubjectsFactory.TechnicalDrawingsFactory;
import org.junit.Assert;
import org.junit.Test;

public class TechnicalDrawingsFactoryTest {

    @Test
    public void getTechnicalDrawings() {

        String code = "TDRW";
        Double pmark = 92.5;

        TechnicalDrawings c = TechnicalDrawingsFactory.getTechnicalDrawings(code,pmark);
        System.out.println(c);
        Assert.assertNotNull(c.getSubjectCode()+"\n"+c.getMark());
    }

}
