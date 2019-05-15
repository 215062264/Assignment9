package ac.za.cput.factoryTest.peopleFactoryTest;

import ac.za.cput.domain.people.Student;
import ac.za.cput.factory.peopleFactory.StudentFactory;
import org.junit.Assert;
import org.junit.Test;

public class StudentFactoryTest {

    @Test
    public void getStudent() {

        String fname = "Kyle";
        String lname = "Josias";
        int eAge = 25;

        Student c = StudentFactory.getStudent(fname,lname,eAge);
        System.out.println(c);
        Assert.assertNotNull(c.getStudentFirstName()+"\n"+c.getStudentLastName()+"\n"+c.getAge());
    }

}
