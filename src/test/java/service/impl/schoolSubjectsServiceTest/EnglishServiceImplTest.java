package service.impl.schoolSubjectsServiceTest;

import ac.za.cput.domain.schoolSubjects.English;
import ac.za.cput.factory.schoolSubjectsFactory.EnglishFactory;
import ac.za.cput.repository.impl.EnglishRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EnglishServiceImplTest {

    private EnglishRepositoryImpl repository;
    private English english;

    private English getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = (EnglishRepositoryImpl) EnglishRepositoryImpl.getRepository();
        this.english = EnglishFactory.getEnglish("ENG",98.5);
    }

    @Test
    public void a_create() {
        English created = this.repository.create(this.english);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.english);
    }

    @Test
    public void c_update() {
        String newCourseName = "English ENG";
        English updated = new English.Builder().copy(getSaved()).subjectCode(newCourseName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newCourseName, updated.getSubjectCode());
    }

    @Test
    public void e_delete() {
        English saved = getSaved();
        this.repository.delete(saved.getSubjectCode());
        d_getAll();
    }

    @Test
    public void b_read() {
        English saved = getSaved();
        English read = this.repository.read(saved.getSubjectCode());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<English> english = this.repository.getAll();
        System.out.println("In getall, all = " + english);
    }
}
