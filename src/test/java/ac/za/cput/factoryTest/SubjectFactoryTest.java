package ac.za.cput.factoryTest;

import ac.za.cput.Domain.Subject;
import ac.za.cput.Factory.SubjectFactory;
import org.junit.Assert;
import org.junit.Test;

public class SubjectFactoryTest {

    @Test
    public void getSubjectID() {

        String name = "ADP 3";
        Subject c = SubjectFactory.getSubjectID(name);
        System.out.println(c);
        Assert.assertNotNull(c.getSubjectId());
    }

}
