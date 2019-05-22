package ac.za.cput.service;

import ac.za.cput.domain.people.Student;
import java.util.Set;

public interface StudentService extends IService<Student, String>{
    Set<Student> getAll();
}
