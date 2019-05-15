package ac.za.cput.factory.schoolSubjectsFactory;

import ac.za.cput.domain.schoolSubjects.Registration;

public class RegistrationFactory {

    public static Registration getRegistration(String status,String regNum) {
        return new Registration.Builder()
                .regNum(regNum)
                .status(status)
                .build();
    }

}
