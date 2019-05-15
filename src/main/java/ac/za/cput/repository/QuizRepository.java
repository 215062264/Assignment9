package ac.za.cput.repository;


import ac.za.cput.domain.academicResults.Quiz;
import java.util.Set;

public interface QuizRepository extends IRepository<Quiz, String> {
    Set<Quiz> getAll();

}