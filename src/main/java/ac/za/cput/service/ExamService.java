package ac.za.cput.service;

import ac.za.cput.domain.academicResults.Exam;

import java.util.Set;

public interface ExamService extends IService<Exam, String> {

    Set<Exam> getAllA();
    Set<Exam> getAll();
}
