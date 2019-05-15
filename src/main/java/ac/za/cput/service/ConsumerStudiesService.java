package ac.za.cput.service;

import ac.za.cput.domain.schoolSubjects.ConsumerStudies;

import java.util.Set;

public interface ConsumerStudiesService extends IService<ConsumerStudies, String>{
    Set<ConsumerStudies> getAllCivil();
    Set<ConsumerStudies> getAll();
}
