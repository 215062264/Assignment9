package ac.za.cput.repository;

import ac.za.cput.domain.academicResults.Exam;
import java.util.Set;

public interface ExamRepository extends IRepository<Exam, String> {
    Set<Exam> getAll();

}