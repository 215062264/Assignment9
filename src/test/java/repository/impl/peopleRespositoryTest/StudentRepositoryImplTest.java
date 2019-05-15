package repository.impl.peopleRespositoryTest;

import ac.za.cput.domain.people.Student;
import ac.za.cput.factory.peopleFactory.StudentFactory;
import ac.za.cput.repository.StudentRepository;
import ac.za.cput.repository.impl.StudentRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentRepositoryImplTest {

    private StudentRepository repository;
    private Student student;

    private Student getSavedCourse() {
        Set<Student> savedCourses = this.repository.getAll();
        return savedCourses.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = StudentRepositoryImpl.getRepository();
        this.student = StudentFactory.getStudent("Kyle","Josias",25);
    }

    @Test
    public void a_create() {
        Student created = this.repository.create(this.student);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.student);
    }

    @Test
    public void b_read() {
        Student savedCourse = getSavedCourse();
        System.out.println("In read, courseId = "+ savedCourse.getStudentId());
        Student read = this.repository.read(savedCourse.getStudentId());
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedCourse, read);
    }

    @Test
    public void e_delete() {
        Student savedCourse = getSavedCourse();
        this.repository.delete(savedCourse.getStudentId());
        getAll();
    }

    @Test
    public void c_update() {
        String newfname = "John";
        String newlname = "Doe";
        int newage = 26;
        Student course = new Student.Builder().copy(getSavedCourse()).studentFirstName(newfname)
                .studentLastName(newlname)
                .age(newage)
                .build();
        System.out.println("In update, about_to_updated = " + course);
        Student updated = this.repository.update(course);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newfname, updated.getStudentFirstName());
        getAll();
    }

    @Test
    public void getAll() {
        Set<Student> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//        Assert.assertSame(1, all.size());
    }

}
