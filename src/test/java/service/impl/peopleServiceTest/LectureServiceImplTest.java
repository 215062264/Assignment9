package service.impl.peopleServiceTest;

import ac.za.cput.domain.people.Lecture;
import ac.za.cput.factory.peopleFactory.LectureFactory;
import ac.za.cput.repository.impl.LectureRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LectureServiceImplTest {

    private LectureRepositoryImpl repository;
    private Lecture lecture;

    private Lecture getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = (LectureRepositoryImpl) LectureRepositoryImpl.getRepository();
        this.lecture = LectureFactory.getLecture("Kyle",2);
    }

    @Test
    public void a_create() {
        Lecture created = this.repository.create(this.lecture);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.lecture);
    }

    @Test
    public void c_update() {
        String newCourseName = "John";
        int newage = 2;
        Lecture updated = new Lecture.Builder().copy(getSaved()).professor(newCourseName)
                .hours(newage)
                .build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newCourseName, updated.getProfessor());
    }

    @Test
    public void e_delete() {
        Lecture saved = getSaved();
        this.repository.delete(saved.getProfessor());
        d_getAll();
    }

    @Test
    public void b_read() {
        Lecture saved = getSaved();
        Lecture read = this.repository.read(saved.getProfessor());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Lecture> lectures = this.repository.getAll();
        System.out.println("In getall, all = " + lectures);
    }
}
