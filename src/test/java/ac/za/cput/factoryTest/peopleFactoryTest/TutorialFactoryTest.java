package ac.za.cput.factoryTest.peopleFactoryTest;

import ac.za.cput.domain.people.Tutorial;
import ac.za.cput.factory.peopleFactory.TutorialFactory;
import org.junit.Assert;
import org.junit.Test;

public class TutorialFactoryTest {

    @Test
    public void getTutorial() {

        String fname = "Tony";
        String lname = "Stark";
        String tId = "7777";

        Tutorial c = TutorialFactory.getTutorial(fname,lname);
        System.out.println(c);
        Assert.assertNotNull(c.getTutorFirstName()+"\n"+c.getTutorLastName()+"\n"+c.getTutorId());
    }

}
