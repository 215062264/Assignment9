package ac.za.cput.factory.schoolSubjectsFactory;

import ac.za.cput.domain.schoolSubjects.Science;

public class ScienceFactory {

    public static Science getScience(String subjectCode, double mark) {
        return new Science.Builder()
                .subjectCode(subjectCode)
                .mark(mark)
                .build();
    }

}
