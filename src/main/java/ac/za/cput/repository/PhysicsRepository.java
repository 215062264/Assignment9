package ac.za.cput.repository;

import ac.za.cput.domain.schoolSubjects.Physics;
import java.util.Set;

public interface PhysicsRepository extends IRepository<Physics, String> {
    Set<Physics> getAll();

}