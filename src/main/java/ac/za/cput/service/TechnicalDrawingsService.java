package ac.za.cput.service;

import ac.za.cput.domain.schoolSubjects.TechnicalDrawings;

import java.util.Set;

public interface TechnicalDrawingsService extends IService<TechnicalDrawings, String> {

    Set<TechnicalDrawings> getAllP();
    Set<TechnicalDrawings> getAll();
}
