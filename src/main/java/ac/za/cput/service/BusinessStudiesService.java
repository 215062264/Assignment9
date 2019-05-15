package ac.za.cput.service;

import ac.za.cput.domain.schoolSubjects.BusinessStudies;

import java.util.Set;

public interface BusinessStudiesService extends IService<BusinessStudies, String> {
    Set<BusinessStudies> getAllBusiness();
    Set<BusinessStudies> getAll();
}
