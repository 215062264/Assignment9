package service.impl.schoolSubjectsServiceTest;

import ac.za.cput.domain.schoolSubjects.ConsumerStudies;
import ac.za.cput.factory.schoolSubjectsFactory.ConsumerStudiesFactory;
import ac.za.cput.repository.impl.ConsumerStudiesRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ConsumerStudiesServiceImplTest {

    private ConsumerStudiesRepositoryImpl repository;
    private ConsumerStudies consumerStudies;

    private ConsumerStudies getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = (ConsumerStudiesRepositoryImpl) ConsumerStudiesRepositoryImpl.getRepository();
        this.consumerStudies = ConsumerStudiesFactory.getConsumerStudies("CON",75.5);
    }

    @Test
    public void a_create() {
        ConsumerStudies created = this.repository.create(this.consumerStudies);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.consumerStudies);
    }

    @Test
    public void c_update() {
        String newCourseName = "Consumer Studies CON";
        ConsumerStudies updated = new ConsumerStudies.Builder().copy(getSaved()).subjectCode(newCourseName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newCourseName, updated.getSubjectCode());
    }

    @Test
    public void e_delete() {
        ConsumerStudies saved = getSaved();
        this.repository.delete(saved.getSubjectCode());
        d_getAll();
    }

    @Test
    public void b_read() {
        ConsumerStudies saved = getSaved();
        ConsumerStudies read = this.repository.read(saved.getSubjectCode());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<ConsumerStudies> consumerStudies = this.repository.getAll();
        System.out.println("In getall, all = " + consumerStudies);
    }

}
