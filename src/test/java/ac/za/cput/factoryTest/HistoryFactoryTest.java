package ac.za.cput.factoryTest;

import ac.za.cput.Domain.History;
import ac.za.cput.Factory.HistoryFactory;
import org.junit.Assert;
import org.junit.Test;

public class HistoryFactoryTest {

    @Test
    public void getHistory() {

        String code = "HIST";
        Double pmark = 87.5;

        History c = HistoryFactory.getHistory(code,pmark);
        System.out.println(c);
        Assert.assertNotNull(c.getSubjectCode()+"\n"+c.getMark());
    }

}
