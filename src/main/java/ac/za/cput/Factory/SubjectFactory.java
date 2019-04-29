package ac.za.cput.Factory;

import ac.za.cput.Domain.Subject;
import ac.za.cput.util.Misc;

public class SubjectFactory {

    public static Subject getSubjectID(String subjectName) {
        return new Subject.Builder().subjectId(Misc.generateId())
                .subjectName(subjectName)
                .build();
    }

}
