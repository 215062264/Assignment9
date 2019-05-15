package ac.za.cput.service;

import ac.za.cput.domain.schoolSubjects.Registration;

import java.util.Set;

public interface RegistrationService extends IService<Registration, String> {
    Set<Registration> getAllP();
    Set<Registration> getAll();
}
