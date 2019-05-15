package service.impl.peopleServiceTest;

import ac.za.cput.domain.people.Student;
import ac.za.cput.factory.peopleFactory.StudentFactory;
import ac.za.cput.repository.impl.StudentRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentServiceImplTest {

    private StudentRepositoryImpl repository;
    private Student student;

    private Student getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = (StudentRepositoryImpl) StudentRepositoryImpl.getRepository();
        this.student = StudentFactory.getStudent("Kyle","Josias",25);
    }

    @Test
    public void a_create() {
        Student created = this.repository.create(this.student);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.student);
    }

    @Test
    public void c_update() {
        String newCourseName = "John";
        String newlname = "Doe";
        int newage = 26;
        Student updated = new Student.Builder().copy(getSaved()).studentFirstName(newCourseName)
                .studentLastName(newlname)
                .age(newage)
                .build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newCourseName, updated.getStudentFirstName());
    }

    @Test
    public void e_delete() {
        Student saved = getSaved();
        this.repository.delete(saved.getStudentId());
        d_getAll();
    }

    @Test
    public void b_read() {
        Student saved = getSaved();
        Student read = this.repository.read(saved.getStudentId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Student> students = this.repository.getAll();
        System.out.println("In getall, all = " + students);
    }
}
