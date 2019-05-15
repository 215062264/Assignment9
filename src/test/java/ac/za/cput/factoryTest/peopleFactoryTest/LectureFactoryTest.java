package ac.za.cput.factoryTest.peopleFactoryTest;

import ac.za.cput.domain.people.Lecture;
import ac.za.cput.factory.peopleFactory.LectureFactory;
import org.junit.Assert;
import org.junit.Test;

public class LectureFactoryTest {

    @Test
    public void getLecture() {

        String prf = "Moriarty";
        int hours = 2;

        Lecture c = LectureFactory.getLecture(prf,hours);
        System.out.println(c);
        Assert.assertNotNull(c.getProfessor()+"\n"+c.getHours());
    }

}
