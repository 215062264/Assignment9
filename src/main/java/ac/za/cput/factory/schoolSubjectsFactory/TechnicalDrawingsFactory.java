package ac.za.cput.factory.schoolSubjectsFactory;

import ac.za.cput.domain.schoolSubjects.TechnicalDrawings;

public class TechnicalDrawingsFactory {

    public static TechnicalDrawings getTechnicalDrawings(String subjectCode, double mark) {
        return new TechnicalDrawings.Builder()
                .subjectCode(subjectCode)
                .mark(mark)
                .build();
    }

}
