package ac.za.cput.factory.schoolSubjectsFactory;

import ac.za.cput.domain.schoolSubjects.English;

public class EnglishFactory {

    public static English getEnglish(String subjectCode, double mark) {
        return new English.Builder()
                .subjectCode(subjectCode)
                .mark(mark)
                .build();
    }

}
