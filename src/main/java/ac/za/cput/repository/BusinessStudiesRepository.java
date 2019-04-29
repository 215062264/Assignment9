package ac.za.cput.repository;

import ac.za.cput.Domain.BusinessStudies;
import java.util.Set;


public interface BusinessStudiesRepository extends IRepository<BusinessStudies, String> {
    Set<BusinessStudies> getAll();

}