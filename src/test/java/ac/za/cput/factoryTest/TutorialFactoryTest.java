package ac.za.cput.factoryTest;

import ac.za.cput.Domain.Tutorial;
import ac.za.cput.Factory.TutorialFactory;
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
