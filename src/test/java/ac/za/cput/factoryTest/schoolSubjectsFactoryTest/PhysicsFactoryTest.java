package ac.za.cput.factoryTest.schoolSubjectsFactoryTest;

import ac.za.cput.domain.schoolSubjects.Physics;
import ac.za.cput.factory.schoolSubjectsFactory.PhysicsFactory;
import org.junit.Assert;
import org.junit.Test;

public class PhysicsFactoryTest {

    @Test
    public void getScience() {

        String code = "PHY";
        Double pmark = 84.5;

        Physics c = PhysicsFactory.getPhysics(code,pmark);
        System.out.println(c);
        Assert.assertNotNull(c.getSubjectCode()+"\n"+c.getMark());
    }

}
