package ac.za.cput.factory.schoolSubjectsFactory;

import ac.za.cput.domain.schoolSubjects.Mathematics;

public class MathematicsFactory {

    public static Mathematics getMath(String subjectCode, double mark) {
        return new Mathematics.Builder()
                .subjectCode(subjectCode)
                .mark(mark)
                .build();
    }

}
