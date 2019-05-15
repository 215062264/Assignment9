package ac.za.cput.service;

import ac.za.cput.domain.schoolSubjects.Geography;

import java.util.Set;


public interface GeographyService extends IService<Geography, String> {
    Set<Geography> getAllGeo();
    Set<Geography> getAll();
}
