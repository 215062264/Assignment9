package ac.za.cput.repository.impl;

import ac.za.cput.domain.people.Student;
import ac.za.cput.repository.StudentRepository;
import java.util.HashSet;
import java.util.Set;

public class StudentRepositoryImpl implements StudentRepository {

        private static StudentRepositoryImpl repository = null;
        private Set<Student> students;

        private StudentRepositoryImpl() {
            this.students = new HashSet<>();
        }

    private Student findStudent(String studentId) {
        return this.students.stream()
                .filter(student -> student.getStudentId().trim().equals(studentId))
                .findAny()
                .orElse(null);
    }

        public static StudentRepository getRepository(){
            if(repository == null) repository = new StudentRepositoryImpl();
            return repository;
        }

        public Student create(Student student){
            this.students.add(student);
            return student;
        }

    public Student read(final String studentId){
        Student student = findStudent(studentId);
        return student;
    }

    public void delete(String studentId) {
        Student student = findStudent(studentId);
        if (student != null) this.students.remove(student);
    }

    public Student update(Student student){
        Student toDelete = findStudent(student.getStudentId());
        if(toDelete != null) {
            this.students.remove(toDelete);
            return create(student);
        }
        return null;
    }

        public Set<Student> getAll(){
            return this.students;
        }
}


