package ac.za.cput.Factory;

import ac.za.cput.Domain.Registration;

public class RegistrationFactory {

    public static Registration getRegistration(String status,String regNum) {
        return new Registration.Builder()
                .regNum(regNum)
                .status(status)
                .build();
    }

}
