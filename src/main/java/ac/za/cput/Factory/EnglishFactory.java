package ac.za.cput.Factory;

import ac.za.cput.Domain.English;

public class EnglishFactory {

    public static English getEnglish(String subjectCode, double mark) {
        return new English.Builder()
                .subjectCode(subjectCode)
                .mark(mark)
                .build();
    }

}
