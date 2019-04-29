package ac.za.cput.factoryTest;

import ac.za.cput.Domain.ConsumerStudies;
import ac.za.cput.Factory.ConsumerStudiesFactory;
import org.junit.Assert;
import org.junit.Test;

public class ConsumerStudiesFactoryTest {

    @Test
    public void getConsumerStudies() {

        String code = "CON";
        Double pmark = 75.5;

        ConsumerStudies c = ConsumerStudiesFactory.getConsumerStudies(code,pmark);
        System.out.println(c);
        Assert.assertNotNull(c.getSubjectCode()+"\n"+c.getMark());
    }

}
