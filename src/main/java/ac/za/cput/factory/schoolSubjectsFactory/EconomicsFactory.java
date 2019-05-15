package ac.za.cput.factory.schoolSubjectsFactory;

import ac.za.cput.domain.schoolSubjects.Economics;

public class EconomicsFactory {

    public static Economics getEconomics(String subjectCode, double mark) {
        return new Economics.Builder()
                .subjectCode(subjectCode)
                .mark(mark)
                .build();
    }

}
