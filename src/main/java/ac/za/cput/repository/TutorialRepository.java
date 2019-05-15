package ac.za.cput.repository;


import ac.za.cput.domain.people.Tutorial;
import java.util.Set;

public interface TutorialRepository extends IRepository<Tutorial, String> {
    Set<Tutorial> getAll();

}