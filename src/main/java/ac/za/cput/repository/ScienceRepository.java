package ac.za.cput.repository;


import ac.za.cput.Domain.Science;
import java.util.Set;

public interface ScienceRepository extends IRepository<Science, String> {
    Set<Science> getAll();

}