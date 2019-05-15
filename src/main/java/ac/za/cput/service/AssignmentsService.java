package ac.za.cput.service;

import ac.za.cput.domain.academicResults.Assignments;

import java.util.Set;

public interface AssignmentsService extends IService<Assignments, String> {
    Set<Assignments> getAllA();
    Set<Assignments> getAll();
}
