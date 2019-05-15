package service.impl.schoolSubjectsServiceTest;

import ac.za.cput.domain.schoolSubjects.Economics;
import ac.za.cput.factory.schoolSubjectsFactory.EconomicsFactory;
import ac.za.cput.repository.impl.EconomicsRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EconomicsServiceImplTest {

    private EconomicsRepositoryImpl repository;
    private Economics economics;

    private Economics getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = (EconomicsRepositoryImpl) EconomicsRepositoryImpl.getRepository();
        this.economics = EconomicsFactory.getEconomics("ECO",95.5);
    }

    @Test
    public void a_create() {
        Economics created = this.repository.create(this.economics);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.economics);
    }

    @Test
    public void c_update() {
        String newCourseName = "Economics ECO";
        Economics updated = new Economics.Builder().copy(getSaved()).subjectCode(newCourseName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newCourseName, updated.getSubjectCode());
    }

    @Test
    public void e_delete() {
        Economics saved = getSaved();
        this.repository.delete(saved.getSubjectCode());
        d_getAll();
    }

    @Test
    public void b_read() {
        Economics saved = getSaved();
        Economics read = this.repository.read(saved.getSubjectCode());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Economics> economics = this.repository.getAll();
        System.out.println("In getall, all = " + economics);
    }

}
