package service.impl.academicResultsServiceTest;

import ac.za.cput.domain.academicResults.Exam;
import ac.za.cput.factory.academicsResultsFactory.ExamFactory;
import ac.za.cput.repository.impl.ExamRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExamServiceImplTest {

    private ExamRepositoryImpl repository;
    private Exam exam;

    private Exam getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = (ExamRepositoryImpl) ExamRepositoryImpl.getRepository();
        this.exam = ExamFactory.getExam("123456","215062264",100.0);
    }

    @Test
    public void a_create() {
        Exam created = this.repository.create(this.exam);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.exam);
    }

    @Test
    public void c_update() {
        String newCourseName = "123456";
        String newlname = "215062264";
        double newage = 100.0;
        Exam updated = new Exam.Builder().copy(getSaved()).examNum(newCourseName)
                .studentNum(newlname)
                .mark(newage)
                .build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newCourseName, updated.getExamNum());
    }

    @Test
    public void e_delete() {
        Exam saved = getSaved();
        this.repository.delete(saved.getStudentNum());
        d_getAll();
    }

    @Test
    public void b_read() {
        Exam saved = getSaved();
        Exam read = this.repository.read(saved.getStudentNum());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Exam> students = this.repository.getAll();
        System.out.println("In getall, all = " + students);
    }
}
