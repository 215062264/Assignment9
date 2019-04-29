package ac.za.cput.factoryTest;

import ac.za.cput.Domain.Mathematics;
import ac.za.cput.Factory.MathematicsFactory;
import org.junit.Assert;
import org.junit.Test;

public class MathematicsFactoryTest {

    @Test
    public void getMath() {

        String code = "MAT";
        Double pmark = 96.7;

        Mathematics c = MathematicsFactory.getMath(code,pmark);
        System.out.println(c);
        Assert.assertNotNull(c.getSubjectCode()+"\n"+c.getMark());
    }

}
