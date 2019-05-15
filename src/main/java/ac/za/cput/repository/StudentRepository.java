package ac.za.cput.repository;

import ac.za.cput.domain.people.Student;
import java.util.Set;

public interface StudentRepository extends IRepository<Student, String> {
    Set<Student> getAll();

}
