package ac.za.cput.factoryTest;

import ac.za.cput.Domain.Accounting;
import ac.za.cput.Factory.AccountingFactory;
import org.junit.Assert;
import org.junit.Test;

public class AccountingFactoryTest {

    @Test
    public void getAccounting() {

        String code = "ACT";
        Double pmark = 80.0;

        Accounting c = AccountingFactory.getAccounting(code,pmark);
        System.out.println(c);
        Assert.assertNotNull(c.getSubjectCode()+"\n"+c.getMark());
    }

}
