package ac.za.cput.factory.academicsResultsFactory;

import ac.za.cput.domain.academicResults.Assignments;

public class AssignmentsFactory {

    public static Assignments getAssignments(String duedate, String studentNum, double mark) {
        return new Assignments.Builder()
                .dueDate(duedate)
                .studentNum(studentNum)
                .mark(mark)
                .build();
    }

}
