package ac.za.cput.service;

import ac.za.cput.domain.people.Tutorial;

import java.util.Set;

public interface TutorialService extends IService<Tutorial, String> {
    Set<Tutorial> getAllP();
    Set<Tutorial> getAll();
}
