package ac.za.cput.factoryTest.schoolSubjectsFactoryTest;

import ac.za.cput.domain.schoolSubjects.BusinessStudies;
import ac.za.cput.factory.schoolSubjectsFactory.BusinessStudiesFactory;
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
