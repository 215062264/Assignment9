package service.impl.schoolSubjectsServiceTest;

import ac.za.cput.domain.schoolSubjects.BusinessStudies;
import ac.za.cput.factory.schoolSubjectsFactory.BusinessStudiesFactory;
import ac.za.cput.repository.impl.BusinessStudiesRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BusinessStudiesServiceImplTest {

    private BusinessStudiesRepositoryImpl repository;
    private BusinessStudies businessStudies;

    private BusinessStudies getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = (BusinessStudiesRepositoryImpl) BusinessStudiesRepositoryImpl.getRepository();
        this.businessStudies = BusinessStudiesFactory.getBusinessStudies("BUS",85.5);
    }

    @Test
    public void a_create() {
        BusinessStudies created = this.repository.create(this.businessStudies);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.businessStudies);
    }

    @Test
    public void c_update() {
        String newCourseName = "Business Studies BUS";
        BusinessStudies updated = new BusinessStudies.Builder().copy(getSaved()).subjectCode(newCourseName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newCourseName, updated.getSubjectCode());
    }

    @Test
    public void e_delete() {
        BusinessStudies saved = getSaved();
        this.repository.delete(saved.getSubjectCode());
        d_getAll();
    }

    @Test
    public void b_read() {
        BusinessStudies saved = getSaved();
        BusinessStudies read = this.repository.read(saved.getSubjectCode());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<BusinessStudies> businessStudies = this.repository.getAll();
        System.out.println("In getall, all = " + businessStudies);
    }

}
