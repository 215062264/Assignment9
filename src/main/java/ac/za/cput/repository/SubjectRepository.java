package ac.za.cput.repository;

import ac.za.cput.domain.schoolSubjects.Subject;

import java.util.Set;

public interface SubjectRepository extends IRepository<Subject, String> {
    Set<Subject> getAll();

}
