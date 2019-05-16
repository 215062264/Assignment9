package ac.za.cput.service;

import ac.za.cput.domain.academicResults.Results;

import java.util.Set;

public interface ResultsService extends IService<Results,String> {
    Set<Results> getAllP();
    Set<Results> getAll();
}
