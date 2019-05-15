package service.impl.peopleServiceTest;

import ac.za.cput.domain.people.Tutorial;
import ac.za.cput.factory.peopleFactory.TutorialFactory;
import ac.za.cput.repository.impl.TutorialRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TutorialServiceImplTest {

    private TutorialRepositoryImpl repository;
    private Tutorial tutorial;

    private Tutorial getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = (TutorialRepositoryImpl) TutorialRepositoryImpl.getRepository();
        this.tutorial = TutorialFactory.getTutorial("Kyle","Josias");
    }

    @Test
    public void a_create() {
        Tutorial created = this.repository.create(this.tutorial);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.tutorial);
    }

    @Test
    public void c_update() {
        String newCourseName = "John";
        String newlname = "Doe";
        Tutorial updated = new Tutorial.Builder().copy(getSaved()).tutorFirstName(newCourseName)
                .tutorLastName(newlname)
                .build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newCourseName, updated.getTutorFirstName());
    }

    @Test
    public void e_delete() {
        Tutorial saved = getSaved();
        this.repository.delete(saved.getTutorId());
        d_getAll();
    }

    @Test
    public void b_read() {
        Tutorial saved = getSaved();
        Tutorial read = this.repository.read(saved.getTutorId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Tutorial> tutorials = this.repository.getAll();
        System.out.println("In getall, all = " + tutorials);
    }
}
