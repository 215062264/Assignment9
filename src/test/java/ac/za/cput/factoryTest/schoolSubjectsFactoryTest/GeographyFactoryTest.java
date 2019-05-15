package ac.za.cput.factoryTest.schoolSubjectsFactoryTest;

import ac.za.cput.domain.schoolSubjects.Geography;
import ac.za.cput.factory.schoolSubjectsFactory.GeographyFactory;
import org.junit.Assert;
import org.junit.Test;

public class GeographyFactoryTest {

    @Test
    public void getGeography() {

        String code = "GEO";
        Double pmark = 87.5;

        Geography c = GeographyFactory.getGeography(code,pmark);
        System.out.println(c);
        Assert.assertNotNull(c.getSubjectCode()+"\n"+c.getMark());
    }

}
