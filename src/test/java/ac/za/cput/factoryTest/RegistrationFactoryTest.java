package ac.za.cput.factoryTest;

import ac.za.cput.Domain.Registration;
import ac.za.cput.Factory.RegistrationFactory;
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
