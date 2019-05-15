package ac.za.cput.repository;

import ac.za.cput.domain.schoolSubjects.BusinessStudies;
import java.util.Set;


public interface BusinessStudiesRepository extends IRepository<BusinessStudies, String> {
    Set<BusinessStudies> getAll();

}