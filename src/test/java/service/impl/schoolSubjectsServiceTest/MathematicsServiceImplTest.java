package service.impl.schoolSubjectsServiceTest;

import ac.za.cput.domain.schoolSubjects.Mathematics;
import ac.za.cput.factory.schoolSubjectsFactory.MathematicsFactory;
import ac.za.cput.repository.impl.MathsRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MathematicsServiceImplTest {

    private MathsRepositoryImpl repository;
    private Mathematics mathematics;

    private Mathematics getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = (MathsRepositoryImpl) MathsRepositoryImpl.getRepository();
        this.mathematics = MathematicsFactory.getMath("MAT",99.0);
    }

    @Test
    public void a_create() {
        Mathematics created = this.repository.create(this.mathematics);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.mathematics);
    }

    @Test
    public void c_update() {
        String newCourseName = "Mathematics MAT";
        Mathematics updated = new Mathematics.Builder().copy(getSaved()).subjectCode(newCourseName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newCourseName, updated.getSubjectCode());
    }

    @Test
    public void e_delete() {
        Mathematics saved = getSaved();
        this.repository.delete(saved.getSubjectCode());
        d_getAll();
    }

    @Test
    public void b_read() {
        Mathematics saved = getSaved();
        Mathematics read = this.repository.read(saved.getSubjectCode());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Mathematics> mathematics = this.repository.getAll();
        System.out.println("In getall, all = " + mathematics);
    }
}
