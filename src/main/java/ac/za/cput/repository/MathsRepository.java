package ac.za.cput.repository;

import ac.za.cput.domain.schoolSubjects.Mathematics;
import java.util.Set;

public interface MathsRepository extends IRepository<Mathematics, String> {
    Set<Mathematics> getAll();

}
