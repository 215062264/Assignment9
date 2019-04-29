package ac.za.cput.repository;


import ac.za.cput.Domain.Results;
import java.util.Set;

public interface ResultRepository extends IRepository<Results, String> {
    Set<Results> getAll();

}