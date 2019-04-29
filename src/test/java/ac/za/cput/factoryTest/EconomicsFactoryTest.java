package ac.za.cput.factoryTest;

import ac.za.cput.Domain.Economics;
import ac.za.cput.Factory.EconomicsFactory;
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
