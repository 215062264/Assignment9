package ac.za.cput.factoryTest.schoolSubjectsFactoryTest;

import ac.za.cput.domain.schoolSubjects.Subject;
import ac.za.cput.factory.schoolSubjectsFactory.SubjectFactory;
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
