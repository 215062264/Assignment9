package ac.za.cput.service;

import ac.za.cput.domain.schoolSubjects.CivilEngineering;

import java.util.Set;

public interface CivilEngineeringService extends IService<CivilEngineering, String> {

    Set<CivilEngineering> getAllCivil();
    Set<CivilEngineering> getAll();
}
