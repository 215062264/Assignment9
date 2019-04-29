package ac.za.cput.factoryTest;

import ac.za.cput.Domain.InformationTech;
import ac.za.cput.Factory.InformationTechFactory;
import org.junit.Assert;
import org.junit.Test;

public class InformationTechFactoryTest {

    @Test
    public void getInfoTech() {

        String code = "IT";
        Double pmark = 100.0;

        InformationTech c = InformationTechFactory.getInfoTech(code,pmark);
        System.out.println(c);
        Assert.assertNotNull(c.getSubjectCode()+"\n"+c.getMark());
    }

}
