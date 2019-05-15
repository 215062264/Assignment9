package ac.za.cput.service;

import ac.za.cput.domain.schoolSubjects.Physics;

import java.util.Set;

public interface PhysicsService extends IService<Physics, String> {
    Set<Physics> getAllP();
    Set<Physics> getAll();
}
