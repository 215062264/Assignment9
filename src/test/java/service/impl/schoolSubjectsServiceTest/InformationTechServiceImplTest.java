package service.impl.schoolSubjectsServiceTest;

import ac.za.cput.domain.schoolSubjects.InformationTech;
import ac.za.cput.factory.schoolSubjectsFactory.InformationTechFactory;
import ac.za.cput.repository.impl.InformationTechRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class InformationTechServiceImplTest {

    private InformationTechRepositoryImpl repository;
    private InformationTech informationTech;

    private InformationTech getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = (InformationTechRepositoryImpl) InformationTechRepositoryImpl.getRepository();
        this.informationTech = InformationTechFactory.getInfoTech("ICT",100.0);
    }

    @Test
    public void a_create() {
        InformationTech created = this.repository.create(this.informationTech);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.informationTech);
    }

    @Test
    public void c_update() {
        String newCourseName = "Information Tech ICT";
        InformationTech updated = new InformationTech.Builder().copy(getSaved()).subjectCode(newCourseName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newCourseName, updated.getSubjectCode());
    }

    @Test
    public void e_delete() {
        InformationTech saved = getSaved();
        this.repository.delete(saved.getSubjectCode());
        d_getAll();
    }

    @Test
    public void b_read() {
        InformationTech saved = getSaved();
        InformationTech read = this.repository.read(saved.getSubjectCode());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<InformationTech> informationTeches = this.repository.getAll();
        System.out.println("In getall, all = " + informationTeches);
    }
}
