package ac.za.cput.repository;

import ac.za.cput.domain.schoolSubjects.ConsumerStudies;
import java.util.Set;

public interface ConsumerStudiesRepository extends IRepository<ConsumerStudies, String> {
    Set<ConsumerStudies> getAll();

}