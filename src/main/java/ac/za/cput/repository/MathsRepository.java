package ac.za.cput.repository;

import ac.za.cput.Domain.Mathematics;
import java.util.Set;

public interface MathsRepository extends IRepository<Mathematics, String> {
    Set<Mathematics> getAll();

}
