package ac.za.cput.repository;


import ac.za.cput.Domain.TechnicalDrawings;
import java.util.Set;


public interface TechnicalDrawingsRepository extends IRepository<TechnicalDrawings, String> {
    Set<TechnicalDrawings> getAll();

}