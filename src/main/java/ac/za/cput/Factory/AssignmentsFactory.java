package ac.za.cput.Factory;

import ac.za.cput.Domain.Assignments;

public class AssignmentsFactory {

    public static Assignments getAssignments(String duedate, String studentNum, double mark) {
        return new Assignments.Builder()
                .dueDate(duedate)
                .studentNum(studentNum)
                .mark(mark)
                .build();
    }

}
