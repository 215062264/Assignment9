package service.impl.schoolSubjectsServiceTest;

import ac.za.cput.domain.schoolSubjects.Science;
import ac.za.cput.factory.schoolSubjectsFactory.ScienceFactory;
import ac.za.cput.repository.impl.ScienceRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ScienceServiceImplTest {

    private ScienceRepositoryImpl repository;
    private Science science;

    private Science getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = (ScienceRepositoryImpl) ScienceRepositoryImpl.getRepository();
        this.science = ScienceFactory.getScience("SCI",92.6);
    }

    @Test
    public void a_create() {
        Science created = this.repository.create(this.science);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.science);
    }

    @Test
    public void c_update() {
        String newCourseName = "Science SCI";
        Science updated = new Science.Builder().copy(getSaved()).subjectCode(newCourseName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newCourseName, updated.getSubjectCode());
    }

    @Test
    public void e_delete() {
        Science saved = getSaved();
        this.repository.delete(saved.getSubjectCode());
        d_getAll();
    }

    @Test
    public void b_read() {
        Science saved = getSaved();
        Science read = this.repository.read(saved.getSubjectCode());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Science> sciences = this.repository.getAll();
        System.out.println("In getall, all = " + sciences);
    }
}
