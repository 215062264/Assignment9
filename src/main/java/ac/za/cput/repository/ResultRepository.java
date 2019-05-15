package ac.za.cput.repository;


import ac.za.cput.domain.academicResults.Results;
import java.util.Set;

public interface ResultRepository extends IRepository<Results, String> {
    Set<Results> getAll();

}