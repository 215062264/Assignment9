package ac.za.cput.repository;

import ac.za.cput.domain.schoolSubjects.Registration;
import java.util.Set;

public interface RegistrationRepository extends IRepository<Registration, String> {
    Set<Registration> getAll();

}
