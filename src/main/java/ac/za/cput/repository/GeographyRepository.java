package ac.za.cput.repository;

import ac.za.cput.domain.schoolSubjects.Geography;
import java.util.Set;


public interface GeographyRepository extends IRepository<Geography, String> {
    Set<Geography> getAll();

}