package ac.za.cput.repository;

import ac.za.cput.Domain.Registration;
import java.util.Set;

public interface RegistrationRepository extends IRepository<Registration, String> {
    Set<Registration> getAll();

}
