package ac.za.cput.factoryTest;

import ac.za.cput.Domain.BusinessStudies;
import ac.za.cput.Factory.BusinessStudiesFactory;
import org.junit.Assert;
import org.junit.Test;

public class BusinessStudiesFactoryTest {

    @Test
    public void getBusinessStudies() {

        String code = "BUS";
        Double pmark = 75.0;

        BusinessStudies c = BusinessStudiesFactory.getBusinessStudies(code,pmark);
        System.out.println(c);
        Assert.assertNotNull(c.getSubjectCode()+"\n"+c.getMark());
    }

}
