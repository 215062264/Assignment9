package ac.za.cput.repository;

import ac.za.cput.Domain.LifeOrientation;
import java.util.Set;

public interface LifeOrientationRepository extends IRepository<LifeOrientation, String> {
    Set<LifeOrientation> getAll();

}