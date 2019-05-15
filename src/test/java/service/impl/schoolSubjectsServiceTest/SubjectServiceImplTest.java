package service.impl.schoolSubjectsServiceTest;

import ac.za.cput.domain.schoolSubjects.Subject;
import ac.za.cput.factory.schoolSubjectsFactory.SubjectFactory;
import ac.za.cput.repository.impl.SubjectRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SubjectServiceImplTest {

    private SubjectRepositoryImpl repository;
    private Subject subject;

    private Subject getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = (SubjectRepositoryImpl) SubjectRepositoryImpl.getRepository();
        this.subject = SubjectFactory.getSubjectID("ADP3");
    }

    @Test
    public void a_create() {
        Subject created = this.repository.create(this.subject);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.subject);
    }

    @Test
    public void c_update() {
        String newCourseName = "Applications Development 3";
        Subject updated = new Subject.Builder().copy(getSaved()).subjectName(newCourseName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newCourseName, updated.getSubjectName());
    }

    @Test
    public void e_delete() {
        Subject saved = getSaved();
        this.repository.delete(saved.getSubjectId());
        d_getAll();
    }

    @Test
    public void b_read() {
        Subject saved = getSaved();
        Subject read = this.repository.read(saved.getSubjectId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Subject> registrations = this.repository.getAll();
        System.out.println("In getall, all = " + registrations);
    }
}
