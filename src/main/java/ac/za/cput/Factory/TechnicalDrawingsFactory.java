package ac.za.cput.Factory;

import ac.za.cput.Domain.TechnicalDrawings;

public class TechnicalDrawingsFactory {

    public static TechnicalDrawings getTechnicalDrawings(String subjectCode, double mark) {
        return new TechnicalDrawings.Builder()
                .subjectCode(subjectCode)
                .mark(mark)
                .build();
    }

}
