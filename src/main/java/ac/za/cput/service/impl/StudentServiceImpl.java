package ac.za.cput.service.impl;

import ac.za.cput.domain.people.Student;
import ac.za.cput.repository.StudentRepository;
import ac.za.cput.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.Set;

@Service("studentServiceImpl")
public class StudentServiceImpl implements StudentService {
    @Autowired
    @Qualifier("InMemory")
    private StudentRepository repository;

    @Override
    public Student create(Student student) {
        return repository.create(student);
    }

    @Override
    public Student update(Student student) {
        return repository.update(student);
    }

    @Override
    public void delete(String s) { repository.delete(s); }

    @Override
    public Student read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<Student> getAll() {
        return repository.getAll();
    }

}
