package ac.za.cput.factoryTest;

import ac.za.cput.Domain.Science;
import ac.za.cput.Factory.ScienceFactory;
import org.junit.Assert;
import org.junit.Test;

public class ScienceFactoryTest {

    @Test
    public void getScience() {

        String code = "SCI";
        Double pmark = 84.5;

        Science c = ScienceFactory.getScience(code,pmark);
        System.out.println(c);
        Assert.assertNotNull(c.getSubjectCode()+"\n"+c.getMark());
    }

}
