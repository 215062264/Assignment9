package ac.za.cput.factoryTest;

import ac.za.cput.Domain.LifeOrientation;
import ac.za.cput.Factory.LifeOrientationFactory;
import org.junit.Assert;
import org.junit.Test;

public class LifeOrientationFactoryTest {

    @Test
    public void getLifeOrientation() {

        String code = "LIO";
        Double pmark = 88.2;

        LifeOrientation c = LifeOrientationFactory.getLifeOrientation(code,pmark);
        System.out.println(c);
        Assert.assertNotNull(c.getSubjectCode()+"\n"+c.getMark());
    }

}
