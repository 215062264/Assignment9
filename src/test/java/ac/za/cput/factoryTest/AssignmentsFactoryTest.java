package ac.za.cput.factoryTest;

import ac.za.cput.Domain.Assignments;
import ac.za.cput.Factory.AssignmentsFactory;
import org.junit.Assert;
import org.junit.Test;

public class AssignmentsFactoryTest {

    @Test
    public void getTutorial() {

        String ddate = "17/07/2019";
        String studNum = "215062264";
        double asMark = 100;

        Assignments c = AssignmentsFactory.getAssignments(ddate,studNum,asMark);
        System.out.println(c);
        Assert.assertNotNull(c.getDueDate()+"\n"+c.getStudentNum()+"\n"+c.getAssignmentMark());
    }

}
