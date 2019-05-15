package ac.za.cput.factoryTest.schoolSubjectsFactoryTest;

import ac.za.cput.domain.schoolSubjects.ConsumerStudies;
import ac.za.cput.factory.schoolSubjectsFactory.ConsumerStudiesFactory;
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
