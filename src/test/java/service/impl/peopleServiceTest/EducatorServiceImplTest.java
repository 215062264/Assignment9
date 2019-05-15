package service.impl.peopleServiceTest;

import ac.za.cput.domain.people.Educator;
import ac.za.cput.factory.peopleFactory.EducatorFactory;
import ac.za.cput.repository.impl.EducatorRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EducatorServiceImplTest {

    private EducatorRepositoryImpl repository;
    private Educator educator;

    private Educator getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = (EducatorRepositoryImpl) EducatorRepositoryImpl.getRepository();
        this.educator = EducatorFactory.getEducator("Kyle","Josias","2134",25);
    }

    @Test
    public void a_create() {
        Educator created = this.repository.create(this.educator);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.educator);
    }

    @Test
    public void c_update() {
        String newCourseName = "John";
        String newlname = "Doe";
        int newage = 26;
        Educator updated = new Educator.Builder().copy(getSaved()).educatorFirstName(newCourseName)
                .educatorLastName(newlname)
                .age(newage)
                .build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newCourseName, updated.getEducatorFirstName());
    }

    @Test
    public void e_delete() {
        Educator saved = getSaved();
        this.repository.delete(saved.getEducatorId());
        d_getAll();
    }

    @Test
    public void b_read() {
        Educator saved = getSaved();
        Educator read = this.repository.read(saved.getEducatorId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Educator> students = this.repository.getAll();
        System.out.println("In getall, all = " + students);
    }
}
