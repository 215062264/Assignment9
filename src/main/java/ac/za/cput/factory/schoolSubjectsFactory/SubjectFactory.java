package ac.za.cput.factory.schoolSubjectsFactory;

import ac.za.cput.domain.schoolSubjects.Subject;
import ac.za.cput.util.Misc;

public class SubjectFactory {

    public static Subject getSubjectID(String subjectName) {
        return new Subject.Builder().subjectId(Misc.generateId())
                .subjectName(subjectName)
                .build();
    }

}
