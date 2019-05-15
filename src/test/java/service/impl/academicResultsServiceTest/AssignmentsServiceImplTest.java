package service.impl.academicResultsServiceTest;

import ac.za.cput.domain.academicResults.Assignments;
import ac.za.cput.factory.academicsResultsFactory.AssignmentsFactory;
import ac.za.cput.repository.impl.AssignmentsRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AssignmentsServiceImplTest {

    private AssignmentsRepositoryImpl repository;
    private Assignments assignments;

    private Assignments getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = (AssignmentsRepositoryImpl) AssignmentsRepositoryImpl.getRepository();
        this.assignments = AssignmentsFactory.getAssignments("1 June 2019","215062264",100.0);
    }

    @Test
    public void a_create() {
        Assignments created = this.repository.create(this.assignments);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.assignments);
    }

    @Test
    public void c_update() {
        String newCourseName = "2 June 2019";
        String newlname = "215062264";
        double newage = 100.0;
        Assignments updated = new Assignments.Builder().copy(getSaved()).dueDate(newCourseName)
                .studentNum(newlname)
                .mark(newage)
                .build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newCourseName, updated.getDueDate());
    }

    @Test
    public void e_delete() {
        Assignments saved = getSaved();
        this.repository.delete(saved.getStudentNum());
        d_getAll();
    }

    @Test
    public void b_read() {
        Assignments saved = getSaved();
        Assignments read = this.repository.read(saved.getStudentNum());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Assignments> students = this.repository.getAll();
        System.out.println("In getall, all = " + students);
    }
}
