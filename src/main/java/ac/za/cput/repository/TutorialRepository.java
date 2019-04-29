package ac.za.cput.repository;


import ac.za.cput.Domain.Tutorial;
import java.util.Set;

public interface TutorialRepository extends IRepository<Tutorial, String> {
    Set<Tutorial> getAll();

}