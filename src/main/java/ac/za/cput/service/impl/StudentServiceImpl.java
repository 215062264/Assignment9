package ac.za.cput.service.impl;

import ac.za.cput.domain.people.Student;
import ac.za.cput.repository.StudentRepository;
import ac.za.cput.repository.impl.StudentRepositoryImpl;
import ac.za.cput.service.StudentService;
import java.util.Set;

public class StudentServiceImpl implements StudentService {

    private StudentServiceImpl service = null;
    private StudentRepository repository;

    private StudentServiceImpl(){
        this.repository = StudentRepositoryImpl.getRepository();
    }

    public StudentService getService(){
        if (service == null) service = new StudentServiceImpl();
        return service;
    }


    @Override
    public Student create(Student student) {
        return this.repository.create(student);
    }

    @Override
    public Student update(Student student) {
        return this.repository.update(student);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Student read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Student> getAllStudents() {
        Set<Student> students = getAll();

        return null;
    }

    @Override
    public Set<Student> getAll() {
        return this.repository.getAll();
    }

}
