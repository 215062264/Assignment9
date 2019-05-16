package service.impl.academicResultsServiceTest;

import ac.za.cput.domain.academicResults.Quiz;
import ac.za.cput.factory.academicsResultsFactory.QuizFactory;
import ac.za.cput.repository.impl.QuizRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class QuizServiceImplTest {

    private QuizRepositoryImpl repository;
    private Quiz quiz;

    private Quiz getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = (QuizRepositoryImpl) QuizRepositoryImpl.getRepository();
        this.quiz = QuizFactory.getQuiz("1 June 2019","215062264",100.0);
    }

    @Test
    public void a_create() {
        Quiz created = this.repository.create(this.quiz);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.quiz);
    }

    @Test
    public void c_update() {
        String newCourseName = "10 June 2019";
        String newlname = "215062264";
        double newage = 100.0;
        Quiz updated = new Quiz.Builder().copy(getSaved()).dueDate(newCourseName)
                .studentNum(newlname)
                .mark(newage)
                .build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newCourseName, updated.getDueDate());
    }

    @Test
    public void e_delete() {
        Quiz saved = getSaved();
        this.repository.delete(saved.getStudentNum());
        d_getAll();
    }

    @Test
    public void b_read() {
        Quiz saved = getSaved();
        Quiz read = this.repository.read(saved.getStudentNum());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Quiz> quizzes = this.repository.getAll();
        System.out.println("In getall, all = " + quizzes);
    }
}
