package ac.za.cput.factoryTest.schoolSubjectsFactoryTest;

import ac.za.cput.domain.schoolSubjects.Registration;
import ac.za.cput.factory.schoolSubjectsFactory.RegistrationFactory;
import org.junit.Assert;
import org.junit.Test;

public class RegistrationFactoryTest {

    @Test
    public void getRegistration() {

        String status = "Registered";
        String RegNum = "12345ABC";

        Registration c = RegistrationFactory.getRegistration(status,RegNum);
        System.out.println(c);
        Assert.assertNotNull(c.getStatuse()+"\n"+c.getRegNum());
    }

}
