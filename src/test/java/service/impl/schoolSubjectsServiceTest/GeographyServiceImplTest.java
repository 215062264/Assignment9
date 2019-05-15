package service.impl.schoolSubjectsServiceTest;

import ac.za.cput.domain.schoolSubjects.Geography;
import ac.za.cput.factory.schoolSubjectsFactory.GeographyFactory;
import ac.za.cput.repository.impl.GeographyRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GeographyServiceImplTest {

    private GeographyRepositoryImpl repository;
    private Geography geography;

    private Geography getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = (GeographyRepositoryImpl) GeographyRepositoryImpl.getRepository();
        this.geography = GeographyFactory.getGeography("GEO",78.5);
    }

    @Test
    public void a_create() {
        Geography created = this.repository.create(this.geography);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.geography);
    }

    @Test
    public void c_update() {
        String newCourseName = "Geography GEO";
        Geography updated = new Geography.Builder().copy(getSaved()).subjectCode(newCourseName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newCourseName, updated.getSubjectCode());
    }

    @Test
    public void e_delete() {
        Geography saved = getSaved();
        this.repository.delete(saved.getSubjectCode());
        d_getAll();
    }

    @Test
    public void b_read() {
        Geography saved = getSaved();
        Geography read = this.repository.read(saved.getSubjectCode());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Geography> geography = this.repository.getAll();
        System.out.println("In getall, all = " + geography);
    }
}
