package ac.za.cput.repository;

import ac.za.cput.domain.schoolSubjects.Economics;
import java.util.Set;

public interface EconomicsRepository extends IRepository<Economics, String> {
    Set<Economics> getAll();

}