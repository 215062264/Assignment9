package ac.za.cput.repository;


import ac.za.cput.domain.schoolSubjects.TechnicalDrawings;
import java.util.Set;


public interface TechnicalDrawingsRepository extends IRepository<TechnicalDrawings, String> {
    Set<TechnicalDrawings> getAll();

}