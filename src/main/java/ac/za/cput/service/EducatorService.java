package ac.za.cput.service;

import ac.za.cput.domain.people.Educator;

import java.util.Set;

public interface EducatorService extends IService<Educator,String> {
    Set<Educator> getAllEducators();
    Set<Educator> getAll();
}
