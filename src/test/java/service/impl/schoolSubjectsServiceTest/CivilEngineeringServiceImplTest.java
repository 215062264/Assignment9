package service.impl.schoolSubjectsServiceTest;

import ac.za.cput.domain.schoolSubjects.CivilEngineering;
import ac.za.cput.factory.schoolSubjectsFactory.CivilEngineeringFactory;
import ac.za.cput.repository.impl.CivilEngineeringRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CivilEngineeringServiceImplTest {

    private CivilEngineeringRepositoryImpl repository;
    private CivilEngineering civilEngineering;

    private CivilEngineering getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = (CivilEngineeringRepositoryImpl) CivilEngineeringRepositoryImpl.getRepository();
        this.civilEngineering = CivilEngineeringFactory.getCivilEngineering("CIV",85.5);
    }

    @Test
    public void a_create() {
        CivilEngineering created = this.repository.create(this.civilEngineering);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.civilEngineering);
    }

    @Test
    public void c_update() {
        String newCourseName = "Civil Engineering CIV";
        CivilEngineering updated = new CivilEngineering.Builder().copy(getSaved()).subjectCode(newCourseName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newCourseName, updated.getSubjectCode());
    }

    @Test
    public void e_delete() {
        CivilEngineering saved = getSaved();
        this.repository.delete(saved.getSubjectCode());
        d_getAll();
    }

    @Test
    public void b_read() {
        CivilEngineering saved = getSaved();
        CivilEngineering read = this.repository.read(saved.getSubjectCode());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<CivilEngineering> civilEngineerings = this.repository.getAll();
        System.out.println("In getall, all = " + civilEngineerings);
    }

}
