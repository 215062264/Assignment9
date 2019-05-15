package service.impl.schoolSubjectsServiceTest;

import ac.za.cput.domain.schoolSubjects.Registration;
import ac.za.cput.factory.schoolSubjectsFactory.RegistrationFactory;
import ac.za.cput.repository.impl.RegistrationRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegistrationServiceImplTest {

    private RegistrationRepositoryImpl repository;
    private Registration registration;

    private Registration getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = (RegistrationRepositoryImpl) RegistrationRepositoryImpl.getRepository();
        this.registration = RegistrationFactory.getRegistration("DIPICT3","123456");
    }

    @Test
    public void a_create() {
        Registration created = this.repository.create(this.registration);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.registration);
    }

    @Test
    public void c_update() {
        String newCourseName = "777777";
        Registration updated = new Registration.Builder().copy(getSaved()).regNum(newCourseName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newCourseName, updated.getRegNum());
    }

    @Test
    public void e_delete() {
        Registration saved = getSaved();
        this.repository.delete(saved.getRegNum());
        d_getAll();
    }

    @Test
    public void b_read() {
        Registration saved = getSaved();
        Registration read = this.repository.read(saved.getRegNum());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Registration> registrations = this.repository.getAll();
        System.out.println("In getall, all = " + registrations);
    }
}
