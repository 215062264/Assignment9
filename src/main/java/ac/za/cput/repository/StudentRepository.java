package ac.za.cput.repository;

import ac.za.cput.Domain.Student;
import java.util.Set;

public interface StudentRepository extends IRepository<Student, String> {
    Set<Student> getAll();

}
