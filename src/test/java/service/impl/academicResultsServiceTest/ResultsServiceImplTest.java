package service.impl.academicResultsServiceTest;

import ac.za.cput.domain.academicResults.Results;
import ac.za.cput.factory.academicsResultsFactory.ResultsFactory;
import ac.za.cput.repository.impl.ResultRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ResultsServiceImplTest {

    private ResultRepositoryImpl repository;
    private Results results;

    private Results getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = (ResultRepositoryImpl) ResultRepositoryImpl.getRepository();
        this.results = ResultsFactory.getResults("215062264",100.0);
    }

    @Test
    public void a_create() {
        Results created = this.repository.create(this.results);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.results);
    }

    @Test
    public void c_update() {
        String newlname = "215062264";
        double newage = 100.0;
        Results updated = new Results.Builder().copy(getSaved()).studentNum(newlname)
                .mark(newage)
                .build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newlname, updated.getStudentNum());
    }

    @Test
    public void e_delete() {
        Results saved = getSaved();
        this.repository.delete(saved.getStudentNum());
        d_getAll();
    }

    @Test
    public void b_read() {
        Results saved = getSaved();
        Results read = this.repository.read(saved.getStudentNum());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Results> results = this.repository.getAll();
        System.out.println("In getall, all = " + results);
    }
}
