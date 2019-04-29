package ac.za.cput.factoryTest;

import ac.za.cput.Domain.TechnicalDrawings;
import ac.za.cput.Factory.TechnicalDrawingsFactory;
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
