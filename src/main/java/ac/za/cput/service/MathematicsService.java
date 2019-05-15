package ac.za.cput.service;

import ac.za.cput.domain.schoolSubjects.Mathematics;

import java.util.Set;

public interface MathematicsService extends IService<Mathematics,String> {
    Set<Mathematics> getAllMath();
    Set<Mathematics> getAll();
}
