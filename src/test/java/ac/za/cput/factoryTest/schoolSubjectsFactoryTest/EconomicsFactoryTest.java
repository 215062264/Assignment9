package ac.za.cput.factoryTest.schoolSubjectsFactoryTest;

import ac.za.cput.domain.schoolSubjects.Economics;
import ac.za.cput.factory.schoolSubjectsFactory.EconomicsFactory;
import org.junit.Assert;
import org.junit.Test;

public class EconomicsFactoryTest {

    @Test
    public void getHistory() {

        String code = "ECO";
        Double pmark = 78.5;

        Economics c = EconomicsFactory.getEconomics(code,pmark);
        System.out.println(c);
        Assert.assertNotNull(c.getSubjectCode()+"\n"+c.getMark());
    }

}
