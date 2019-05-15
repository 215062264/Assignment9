package ac.za.cput.service;

import ac.za.cput.domain.schoolSubjects.Subject;

import java.util.Set;

public interface SubjectService extends IService<Subject, String> {
    Set<Subject> getAllP();
    Set<Subject> getAll();
}
