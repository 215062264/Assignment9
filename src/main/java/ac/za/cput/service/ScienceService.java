package ac.za.cput.service;

import ac.za.cput.domain.schoolSubjects.Science;

import java.util.Set;

public interface ScienceService extends IService<Science, String> {

    Set<Science> getAllP();
    Set<Science> getAll();
}
