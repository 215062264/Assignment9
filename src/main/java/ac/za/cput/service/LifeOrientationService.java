package ac.za.cput.service;

import ac.za.cput.domain.schoolSubjects.LifeOrientation;

import java.util.Set;

public interface LifeOrientationService extends IService<LifeOrientation, String> {
    Set<LifeOrientation> getAllLO();
    Set<LifeOrientation> getAll();
}
