package ac.za.cput.service;

import ac.za.cput.domain.schoolSubjects.Economics;

import java.util.Set;

public interface EconomicsService extends IService<Economics, String> {
    Set<Economics> getAllCivil();
    Set<Economics> getAll();
}
