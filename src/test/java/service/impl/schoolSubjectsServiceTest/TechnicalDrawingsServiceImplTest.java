package service.impl.schoolSubjectsServiceTest;

import ac.za.cput.domain.schoolSubjects.TechnicalDrawings;
import ac.za.cput.factory.schoolSubjectsFactory.TechnicalDrawingsFactory;
import ac.za.cput.repository.impl.TechnicalDrawingsRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TechnicalDrawingsServiceImplTest {

    private TechnicalDrawingsRepositoryImpl repository;
    private TechnicalDrawings technicalDrawings;

    private TechnicalDrawings getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = (TechnicalDrawingsRepositoryImpl) TechnicalDrawingsRepositoryImpl.getRepository();
        this.technicalDrawings = TechnicalDrawingsFactory.getTechnicalDrawings("TDR",92.6);
    }

    @Test
    public void a_create() {
        TechnicalDrawings created = this.repository.create(this.technicalDrawings);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.technicalDrawings);
    }

    @Test
    public void c_update() {
        String newCourseName = "Technical Drawings TDR";
        TechnicalDrawings updated = new TechnicalDrawings.Builder().copy(getSaved()).subjectCode(newCourseName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newCourseName, updated.getSubjectCode());
    }

    @Test
    public void e_delete() {
        TechnicalDrawings saved = getSaved();
        this.repository.delete(saved.getSubjectCode());
        d_getAll();
    }

    @Test
    public void b_read() {
        TechnicalDrawings saved = getSaved();
        TechnicalDrawings read = this.repository.read(saved.getSubjectCode());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<TechnicalDrawings> technicalDrawings = this.repository.getAll();
        System.out.println("In getall, all = " + technicalDrawings);
    }
}
